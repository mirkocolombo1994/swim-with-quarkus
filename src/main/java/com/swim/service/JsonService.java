package com.swim.service;

import com.swim.config.JsonServiceConfig;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class JsonService {

    private final JsonServiceConfig jsonConfig;


    public JsonService(JsonServiceConfig jsonConfig) {
        this.jsonConfig = jsonConfig;
    }
}
