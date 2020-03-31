package com.tothenew.springdatajpaqueries.TablePerClassInheritence;

import javax.persistence.Entity;

@Entity
public class RegularEmployeeShowing extends EmployeeShowing {

    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public RegularEmployeeShowing() {
    }

    public RegularEmployeeShowing(String name, int salary, String project) {
        super(name,salary);
        this.project = project;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "project='" + project + '\'' +
                "} " + super.toString();
    }
}
