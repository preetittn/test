package com.jpa.springdata.jpa2.Employee.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("regular_employee")           //single_table

@PrimaryKeyJoinColumn(name = "id")                  //joined
public class RegularEmployee extends Employee {
    private String project;

    @Embedded
    Address address;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public RegularEmployee() { }

    public RegularEmployee(String name,int salary,String project,Address address)
    {
        super(name,salary);
        this.project = project;
        this.address=address;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "project='" + project + '\'' +
                '}';
    }
}
