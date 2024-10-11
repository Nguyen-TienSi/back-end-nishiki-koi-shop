package groupc.backend.application.model.entity;

import groupc.backend.application.model.entity.embedded.OrderId;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tour {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private long price;
    private int attendance;
    private String description;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime createdDate;

    @OneToOne
    @JoinColumn(name = "farm_fk", nullable = false)
    private Farm farm;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "order_tour_item",
            joinColumns = @JoinColumn(name = "tour_fk"),
            inverseJoinColumns = {
                    @JoinColumn(name = "customer_fk"),
                    @JoinColumn(name = "order_date")
            }
    )
    private List<OrderTour> orderTours = new ArrayList<>();
}
