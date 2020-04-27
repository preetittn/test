package com.jpa.springdata.jpa2.Employee.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("trainee_employee")                   //single_table

@PrimaryKeyJoinColumn(name =  "id")                         //joined

public class TraineeEmployee extends Employee {

    private int assessment_score;
    @Embedded
    Address address;

    public int getAssessment_score() {
        return assessment_score;
    }

    public void setAssessment_score(int assessment_score) {
        this.assessment_score = assessment_score;
    }

    public TraineeEmployee(String name, int salary, int assessment_score,Address address) {
        super(name, salary);
        this.assessment_score = assessment_score;
        this.address=address;
    }

    public TraineeEmployee() {}

    @Override
    public String toString() {
        return "TraineeEmployee{" +
                "assessment_score=" + assessment_score +
                '}';
    }
}
