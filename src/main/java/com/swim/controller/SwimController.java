package com.swim.controller;

import jakarta.ws.rs.*;

@Path("swim")
public class SwimController {

    @GET
    @Path("all")
    public String all() {
        return "";
    }

}
