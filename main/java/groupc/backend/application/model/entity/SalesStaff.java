package groupc.backend.application.model.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sales_staff")
public class SalesStaff extends User {
    public SalesStaff() {
        setRole(UserRole.SALESMAN);
    }

    @ManyToMany
    @JoinTable(
            name = "salesst_order_fish",
            joinColumns = @JoinColumn(name = "sales_staff_fk"),
            inverseJoinColumns = {
                    @JoinColumn(name = "customer_fk"),
                    @JoinColumn(name = "order_date")
            }
    )
    private Set<OrderFish> orderFish = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "salesst_order_tour",
            joinColumns = @JoinColumn(name = "salesst_fk"),
            inverseJoinColumns = {
                    @JoinColumn(name = "customer_fk"),
                    @JoinColumn(name = "order_date")
            }
    )
    private Set<OrderTour> orderTours = new HashSet<>();
}