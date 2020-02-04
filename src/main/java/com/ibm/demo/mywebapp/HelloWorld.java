package com.ibm.demo.mywebapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")

public class HelloWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello World from package com.ibm.demo.mywebapp!";
    }
}
