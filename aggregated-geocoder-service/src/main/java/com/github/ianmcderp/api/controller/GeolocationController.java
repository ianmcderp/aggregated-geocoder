package com.github.ianmcderp.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.ianmcderp.api.model.Geolocation;

@RestController
public class GeolocationController {
    @RequestMapping(
        value = "/geolocations",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Geolocation> geolocations() {
        return Arrays.asList(new Geolocation("1600 Amphitheatre Parkway, Mountain View, CA 94043, USA"));
    }
}
