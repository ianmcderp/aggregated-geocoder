package com.github.ianmcderp.service;

import java.util.List;
import java.util.Optional;

import com.github.ianmcderp.api.model.Geolocation;

public interface GeolocationService {
    Optional<List<Geolocation>> getGeolocationsByQuery(String query);
}
