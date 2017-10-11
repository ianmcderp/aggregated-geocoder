package com.github.ianmcderp.api.model;

public class Geolocation {
    private final String formattedAddress;

    public Geolocation(final String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }
}
