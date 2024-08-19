package com.swim.controller;

import jakarta.ws.rs.*;
import lombok.extern.slf4j.Slf4j;

@Path("swim")
@Slf4j
public class SwimController {

    @GET
    @Path("all")
    public String all() {
        return "";
    }

}
