package com.tothenew.springbootrestfulday2assgn.Ques2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/all")
    @ApiOperation(value = "getAllUsers", nickname = "getAll")
    public List<UserModel> getAll() {
        return userService.getAll();
    }

    // ans 11
    @GetMapping("/users/{name}")
    public EntityModel<UserModel> getAUser(@PathVariable String name) {
        UserModel user =  userService.findOne(name);

        EntityModel<UserModel> resource = new EntityModel(user);

        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAll());


        resource.add(linkTo.withRel("all-users"));


        return resource;
    }

    @PostMapping("/user")
    @ApiOperation(value = "AddAUser", nickname = "addAUser")
    public List<UserModel> addUser(@RequestBody UserModel userModel) {
        return userService.post(userModel);
    }

    @DeleteMapping("/user/{name}")
    @ApiOperation(value = "deleteAUser", nickname = "deleteAUser")
    public List<UserModel> deleteUser(@PathVariable String name) {
        return userService.deleteUser(name);
    }
}
