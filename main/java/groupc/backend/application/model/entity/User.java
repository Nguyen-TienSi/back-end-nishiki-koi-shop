package groupc.backend.application.model.entity;

import groupc.backend.application.model.entity.embedded.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Polymorphism;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "user_detail")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    @Id
    @GeneratedValue
    private Long id;

//    @Column(nullable = false)
    private String fullName;

//    @Column(nullable = false)
    private Boolean gender;

//    @Column(nullable = false)
    private LocalDate birthDate;

//    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole role;

//    @Column(nullable = false, unique = true)
    private String username;

//    @Column(unique = true)
    private String email;

//    @Column(nullable = false)
    private String password;

    private String profilePicture;

//    @Column(nullable = false)
    private String phoneNumber;

    @Embedded
    private Address address;

//    @Column(nullable = false)
    private LocalDate createdDate;

//    @Column(nullable = false)
    private Boolean active;
}
