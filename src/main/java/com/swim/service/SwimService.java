package com.swim.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class SwimService {

    @Inject
    JsonService jsonService;

    public String getFile(){
        return jsonService.getFile();
    }

    public String getAllStyles(){
        return jsonService.getAllStyles();
    }

}
