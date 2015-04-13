package com.omsface.learning.dropwizard;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by Omar on 4/11/2015.
 */
@Produces(MediaType.APPLICATION_JSON)
@Path("/dropwizard")
public class DropWizardResource {

    @GET
    @Timed
    @Path("/hello")
    public String hello(@QueryParam("name")String name) {
        String message = "Hello";
//        if(name.isPresent()) {
        if(name != null) {
            message += " " + name;
        }
        return message;
    }

}
