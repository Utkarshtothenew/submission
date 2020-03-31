package com.tothenew.springdatajpaqueries.TablePerClassInheritence;

import javax.persistence.Entity;

@Entity
public class TraineeEmployeeShowing extends EmployeeShowing {
    String assesment_score;

    public TraineeEmployeeShowing() {
    }

    public TraineeEmployeeShowing(String name, int salary, String assesment_score) {
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
