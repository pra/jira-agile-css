package com.spotify.jira.agile.rest;

import com.atlassian.plugins.rest.common.security.AnonymousAllowed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * A resource of message.
 */
@Path("/css")
public class MyTestResource {

/*
    @GET
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getMessage()
    {
       return Response.ok(new MyTestResourceModel("Hello World")).build();
    }
    */
    @GET
    @AnonymousAllowed
    @Produces("text/css")
    public String getCss() {
    	return ".ghx-issue";

    }
}