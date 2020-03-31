package com.tothenew.springdatajpaqueries.JoinedInheritence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class TraineeEmployeeJoined extends EmployeeJoined {
    String assesment_score;

    @Embedded
    Address address;

    public TraineeEmployeeJoined() {
    }

    public TraineeEmployeeJoined(String name, int salary, String assesment_score,Address address) {
        super(name, salary);
        this.assesment_score=assesment_score;
        this.address=address;
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
