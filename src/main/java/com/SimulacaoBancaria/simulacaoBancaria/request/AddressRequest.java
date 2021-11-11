package com.SimulacaoBancaria.simulacaoBancaria.request;

import com.SimulacaoBancaria.simulacaoBancaria.model.Address;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class AddressRequest {

    @NotBlank(message = "{validation.field_required}")
    private String postalCode;

    @NotBlank(message = "{validation.field_required}")
    private String street;

    @NotBlank(message = "{validation.field_required}")
    private String state;

    @NotBlank(message = "{validation.field_required}")
    private String city;

    @NotBlank(message = "{validation.field_required}")
    private String country;

    public AddressRequest() {
    }

    public AddressRequest(String postalCode, String street, String state, String city, String country) {
        this.postalCode = postalCode;
        this.street = street;
        this.state = state;
        this.city = city;
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address requestObjectAddress(){
        Address address = new Address();
        address.setPostalCode(this.postalCode);
        address.setStreet(this.street);
        address.setState(this.state);
        address.setCity(this.city);
        address.setCountry(this.country);
        address.setCreatedAt(LocalDate.now());
        return address;
    }

}