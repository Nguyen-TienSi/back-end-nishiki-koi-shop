package groupc.backend.application.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Manager extends User {
    public Manager() {
        setRole(UserRole.MANAGER);
    }

    @OneToMany(mappedBy = "manager")
    private Set<OrderTour> tours = new HashSet<>();
}
