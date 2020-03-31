package com.tothenew.springbootrestfulday2assgn.Ques2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This is the user class")
public class UserModel {

    @ApiModelProperty(notes = "This is the name of user")
    private String name;
    @ApiModelProperty(notes = "This is the age of user")
    private int age;

    public UserModel() {
    }

    public UserModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
