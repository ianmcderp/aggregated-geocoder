package com.github.ianmcderp.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.ianmcderp.api.model.Geolocation;
import com.github.ianmcderp.config.NominatimProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class NominatimGeolocationService implements GeolocationService {

    private final NominatimProperties properties;

    public NominatimGeolocationService(NominatimProperties properties)  {
        this.properties = properties;
    }

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public Optional<List<Geolocation>> getGeolocationsByQuery(String query) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(properties.getUrl(), String.class, query);
        return Optional.of(Arrays.asList(new Geolocation(query, new Address())));
    }

    public Optional<List<Geolocation>> fallback() {
        return Optional.empty();
    }
}
