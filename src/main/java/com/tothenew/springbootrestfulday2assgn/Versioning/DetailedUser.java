package com.tothenew.springbootrestfulday2assgn.Versioning;

public class DetailedUser {
    String name;
    String add;
    String phone;
    String age;
    Integer id;

    public DetailedUser(String name, String add, String phone, String age, Integer id) {
        this.name = name;
        this.add = add;
        this.phone = phone;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
