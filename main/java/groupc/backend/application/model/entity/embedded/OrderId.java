package groupc.backend.application.model.entity.embedded;

import groupc.backend.application.model.entity.Customer;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Embeddable
public class OrderId {
    @ManyToOne
    @JoinColumn(name = "customer_fk")
    private Customer customer;

    private LocalDate orderDate;
}
