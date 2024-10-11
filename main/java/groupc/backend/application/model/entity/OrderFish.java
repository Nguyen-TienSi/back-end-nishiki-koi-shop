package groupc.backend.application.model.entity;

import groupc.backend.application.model.entity.embedded.Address;
import groupc.backend.application.model.entity.embedded.OrderId;
import groupc.backend.application.model.entity.embedded.OrderFishItem;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "order_fish")
public class OrderFish {
    @EmbeddedId
    private OrderId orderId;

    private long totalAmount;
    @Embedded
    private Address shippingAddress;
    private LocalDateTime deliveryDate;
    private String paymentMethod;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "delivering_staff_fk")
    private DeliveringStaff deliveringStaff;

    @ManyToMany(mappedBy = "orderFish")
    private Set<SalesStaff> salesStaffs = new HashSet<>();

    @ElementCollection
    @CollectionTable(name = "order_fish_item")
    private List<OrderFishItem> orderFishItems = new ArrayList<>();
}