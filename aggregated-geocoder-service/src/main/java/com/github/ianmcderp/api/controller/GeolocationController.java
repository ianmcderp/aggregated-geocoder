package com.github.ianmcderp.api.controller;

import java.util.Arrays;
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

@RestController
public class GeolocationController {
    @RequestMapping(
        value = "/geolocations",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public HttpEntity<List<Geolocation>> geolocations(@RequestParam(value = "query") String query) {
        return new ResponseEntity<List<Geolocation>>(Arrays.asList(new Geolocation(query)), HttpStatus.OK);
    }
}
