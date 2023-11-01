package com.example;

import javax.ws.rs.HEAD;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Produces("application/json")
@Path("/")
public class MyController {

    @HEAD
    @Path("/handler/{handler}")
    public Response checkUserByHandler(@PathParam("handler") String handler) {
        return Response.ok().build();
    }

}
