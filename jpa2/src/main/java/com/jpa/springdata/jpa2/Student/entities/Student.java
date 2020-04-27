package com.jpa.springdata.jpa2.Student.entities;


import javax.persistence.*;

@Entity
public class Student
{
    private String first_name;
    private String last_name;
    private int score;
    @Id
// @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
