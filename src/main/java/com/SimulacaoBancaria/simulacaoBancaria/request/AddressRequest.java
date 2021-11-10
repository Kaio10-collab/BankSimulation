package com.SimulacaoBancaria.simulacaoBancaria.request;

import javax.validation.constraints.NotBlank;

public class AddressRequest {

    @NotBlank
    private String postalCode;

    @NotBlank
    private String street;

    @NotBlank
    private String state;

    @NotBlank
    private String city;

    @NotBlank
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
}
