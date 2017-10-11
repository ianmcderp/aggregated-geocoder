package com.github.ianmcderp.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geolocation {
    @JsonProperty("formatted_address")
    private final String formattedAddress;

    public Geolocation(final String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }
}
