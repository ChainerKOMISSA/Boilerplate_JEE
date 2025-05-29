package com.example.app.controller;

import com.example.app.entity.User;
import com.example.app.service.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    private UserService service;

    @GET
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @POST
    public Response addUser(User user) {
        service.createUser(user);
        return Response.status(Response.Status.CREATED).build();
    }
}

