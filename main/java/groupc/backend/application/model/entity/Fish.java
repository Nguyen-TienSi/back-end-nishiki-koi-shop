package groupc.backend.application.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fish {
    @Id
    private Long id;

    private String name;
    private Double price;
    private String description;
    @Lob
    private byte[] image;
    private Double size;
    private Integer quantity;
    private LocalDate createdDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fish_type_fk")
    private FishType fishType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "farm_fk")
    private Farm farm;
}
