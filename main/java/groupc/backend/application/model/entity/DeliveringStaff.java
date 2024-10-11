package groupc.backend.application.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "delivering_staff")
public class DeliveringStaff extends User {
    public DeliveringStaff() {
        setRole(UserRole.DELIVERYMAN);
    }

    @OneToMany(mappedBy = "deliveringStaff")
    private List<OrderFish> orders = new ArrayList<>();
}
