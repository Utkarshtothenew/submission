package com.tothenew.springdatajpaqueries.JoinedInheritence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class RegularEmployeeJoined extends EmployeeJoined {

    private String project;
    @Embedded
    Address address;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public RegularEmployeeJoined() {
    }

    public RegularEmployeeJoined(String name, int salary, String project,Address address) {
        super(name,salary);
        this.project = project;
        this.address=address;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "project='" + project + '\'' +
                "} " + super.toString();
    }
}
