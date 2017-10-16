package com.github.ianmcderp.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geolocation {
    @JsonProperty("formatted_address")
    private final String formattedAddress;

    @JsonProperty("address")
    private Address address;

    public Geolocation(final String formattedAddress, final Address address) {
        this.formattedAddress = formattedAddress;
        this.address = address;
    }

    public String getFormattedAddress() {
        return this.formattedAddress;
    }

    public Address getAddress() {
        return this.address;
    }
}
