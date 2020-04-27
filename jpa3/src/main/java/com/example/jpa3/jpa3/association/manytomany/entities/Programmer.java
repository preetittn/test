package com.example.jpa3.jpa3.association.manytomany.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Programmer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private  String name;
    private int sal;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="programmers_project",joinColumns=@JoinColumn(name = "programmer_id",referencedColumnName = "id"),
    inverseJoinColumns=@JoinColumn(name = "project_id",referencedColumnName = "id"))
    private Set<Project> projects;

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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
