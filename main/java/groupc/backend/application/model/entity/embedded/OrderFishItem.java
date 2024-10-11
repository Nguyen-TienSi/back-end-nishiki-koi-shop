package groupc.backend.application.model.entity.embedded;

import groupc.backend.application.model.entity.Fish;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class OrderFishItem {
    @ManyToOne
    @JoinColumn(name = "fish_fk")
    private Fish fish;

    private int quantity;
}
