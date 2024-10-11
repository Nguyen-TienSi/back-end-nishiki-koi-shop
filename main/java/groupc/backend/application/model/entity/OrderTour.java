package groupc.backend.application.model.entity;

import groupc.backend.application.model.entity.embedded.OrderId;
import jakarta.persistence.*;
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
@Table(name = "order_tour")
public class OrderTour {
    @EmbeddedId
    private OrderId orderId;

    private long totalAmount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime bookingDate;
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "manager_fk")
    private Manager manager;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToMany(mappedBy = "orderTours")
    private List<Tour> tours = new ArrayList<>();

    @ManyToMany(mappedBy = "orderTours")
    private List<ConsultingStaff> consultingStaffs = new ArrayList<>();

    @ManyToMany(mappedBy = "orderTours")
    private List<SalesStaff> salesStaffs = new ArrayList<>();
}
