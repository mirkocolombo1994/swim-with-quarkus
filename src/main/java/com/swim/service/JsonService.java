package com.swim.service;

import com.swim.config.JsonServiceConfig;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class JsonService {

    private final JsonServiceConfig jsonConfig;

    private final JsonFileService jsonFileService;

    public JsonService(JsonServiceConfig jsonConfig, JsonFileService jsonFileService) {
        this.jsonConfig = jsonConfig;
        this.jsonFileService = jsonFileService;
    }

    public String getFile(){
        return jsonFileService.getConfigFile(jsonConfig.jsonFilePath()).toString();
    }

    public String getAllStyles(){
        return jsonFileService.getAllStyles(jsonConfig.jsonFilePath()).toString();
    }



}
