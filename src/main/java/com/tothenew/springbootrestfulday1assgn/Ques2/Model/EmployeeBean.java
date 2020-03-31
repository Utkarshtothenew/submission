package com.tothenew.springbootrestfulday1assgn.Ques2.Model;

import javax.validation.constraints.Size;

public class EmployeeBean {
    private Integer id;
    @Size(min=3)
    private String name;
    private Integer age;

    public EmployeeBean() {}

    public EmployeeBean(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
