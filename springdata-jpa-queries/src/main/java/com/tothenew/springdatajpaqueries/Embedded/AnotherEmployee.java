package com.tothenew.springdatajpaqueries.Embedded;

import javax.persistence.*;

@Entity
public class AnotherEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    @Embedded
    AnotherEmployeeSalary anotherEmployeeSalary;

    public AnotherEmployee(){}

    public AnotherEmployee(String firstName,String lastName,int age,AnotherEmployeeSalary anotherEmployeeSalary) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.anotherEmployeeSalary=anotherEmployeeSalary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnotherEmployeeSalary getAnotherEmployeeSalary() {
        return anotherEmployeeSalary;
    }

    public void setAnotherEmployeeSalary(AnotherEmployeeSalary anotherEmployeeSalary) {
        this.anotherEmployeeSalary = anotherEmployeeSalary;
    }
}
