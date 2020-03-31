package com.tothenew.springdatajpaqueries.SingleTableInheritence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("trainee_employee")
public class TraineeEmployee extends EmployeeSingle {
    String assesment_score;

    public TraineeEmployee() {
    }

    public TraineeEmployee(String name, int salary, String assesment_score) {
        super(name, salary);
        this.assesment_score=assesment_score;
    }

    public String getAssesment_score() {
        return assesment_score;
    }

    public void setAssesment_score(String assesment_score) {
        this.assesment_score = assesment_score;
    }

    @Override
    public String toString() {
        return "TraineeEmployee{" +
                "assesment_score='" + assesment_score + '\'' +
                "} " + super.toString();
    }
}
