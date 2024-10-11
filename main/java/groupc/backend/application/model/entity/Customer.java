package groupc.backend.application.model.entity;

import groupc.backend.application.model.entity.embedded.OrderId;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Customer extends User {
    public Customer() {
        setRole(UserRole.CUSTOMER);
    }

    @OneToMany(mappedBy = "customer")
    private Set<Feedback> feedback = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "customer_order_id")
    private Set<OrderId> orderIds = new HashSet<>();
}
