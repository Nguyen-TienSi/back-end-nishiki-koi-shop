package groupc.backend.application.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "consulting_staff")
public class ConsultingStaff extends User {
    public ConsultingStaff() {
        setRole(UserRole.CONSULTANT);
    }

    @ManyToMany
    @JoinTable(
            name = "consultingst_order_tour",
            joinColumns = @JoinColumn(name = "consultingst_fk"),
            inverseJoinColumns = {
                    @JoinColumn(name = "customer_id"),
                    @JoinColumn(name = "order_date")
            }
    )
    private List<OrderTour> orderTours = new ArrayList<>();
}
