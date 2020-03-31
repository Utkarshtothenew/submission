package com.tothenew.springdatajpaqueries.SingleTableInheritence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regular_employee")
public class RegularEmployee extends EmployeeSingle {

    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public RegularEmployee() {
    }

    public RegularEmployee(String name, int salary, String project) {
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
