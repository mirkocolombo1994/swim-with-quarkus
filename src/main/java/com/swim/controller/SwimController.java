package com.swim.controller;

import com.swim.service.SwimService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import lombok.extern.slf4j.Slf4j;

@Path("swim")
@Slf4j
public class SwimController {

    @Inject
    private SwimService swimService;

    @GET
    @Path("all")
    public String all() {
        return swimService.getFile();
    }

}
