package com.springdata.idgenerators.employee.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import javax.persistence.*;

@Entity
public class Employee {
//@TableGenerator(name="employee_gen",table="id_gen",pkColumnName = "gen_name",     //table
//        valueColumnName = "gen_val",allocationSize = 100)
@GenericGenerator(name="emp_id",strategy = "com.springdata.idgenerators.employee.entity.CustomidGenerator")
@GeneratedValue(generator = "emp_id")
    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE,generator = "employee_gen")
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
