package com.swim;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/rest")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("hello")
    public String hello() {
        return "Hello from Quarkus REST";
    }

}
