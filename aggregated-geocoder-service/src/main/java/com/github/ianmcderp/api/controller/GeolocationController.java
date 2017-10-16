package com.github.ianmcderp.api.controller;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.ianmcderp.api.model.Geolocation;
import com.github.ianmcderp.service.GeolocationService;

@RestController
public class GeolocationController {

    private final GeolocationService geolocationService;

    public GeolocationController(final GeolocationService geolocationService) {
        this.geolocationService = geolocationService;
    }

    @RequestMapping(
        value = "/geolocations",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public HttpEntity<List<Geolocation>> geolocations(@RequestParam(value = "query") String query) {
        List<Geolocation> geolocations = geolocationService.getGeolocationsByQuery(query).get();
        return new ResponseEntity<>(geolocations, HttpStatus.OK);
    }
}
