package groupc.backend.application.model.entity;


import groupc.backend.application.model.entity.embedded.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Farm {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private String contactInfo;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "farm")
    private Set<Fish> fishes = new HashSet<>();
}
