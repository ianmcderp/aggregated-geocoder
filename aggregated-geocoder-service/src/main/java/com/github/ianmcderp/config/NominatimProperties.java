package com.github.ianmcderp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "NOMINATIM")
public class NominatimProperties {
    @Value("http://nominatim.openstreetmap.org/search?q=%s&format=json&polygon=1&addressdetails=1")
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
