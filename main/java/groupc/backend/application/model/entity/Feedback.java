package groupc.backend.application.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;

    private String comment;
    private LocalDateTime createdDate;

    @Enumerated(EnumType.STRING)
    private Rating rating;

    @ManyToOne
    @JoinColumn(name = "tour_fk")
    private Tour tour;

    @ManyToOne
    @JoinColumn(name = "customer_fk")
    private Customer customer;
}

enum Rating {
    EXCELLENT, GOOD, AVERAGE, POOR, VERY_POOR
}