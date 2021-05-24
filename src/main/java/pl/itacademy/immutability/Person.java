package pl.itacademy.immutability;

import lombok.EqualsAndHashCode;
import lombok.ToString;


@ToString
@EqualsAndHashCode
public class Person {
    private final String firstName;
    private final String lastName;
    private final Address address;

    private Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = addressCopy(address);
    }

    public static Person createPerson(String firstName, String lastName, Address address) {
        return new Person(firstName, lastName, address);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return addressCopy(address);
    }

    private Address addressCopy(Address addressToCopy) {
        return new Address(addressToCopy.getCity(), addressToCopy.getStreet(), addressToCopy.getBuildingNumber());
    }
}
