package groupc.backend.application.model.entity.embedded;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String city;
    private String street;
    private String houseNumber;
    private String zipCode;
}
