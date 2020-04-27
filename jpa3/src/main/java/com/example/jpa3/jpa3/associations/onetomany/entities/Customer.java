package com.example.jpa3.jpa3.associations.onetomany.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL) //
    private Set<Phonenumber> numbers;

    public void setNumbers(Set<Phonenumber> Phonenumbers) {
        this.numbers = Phonenumbers;
    }

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

    private Set<Phonenumber> getNumbers(){
        return numbers;
    }

    public void addNumbers(Set<Phonenumber> numbers)
    {
        this.numbers=numbers;
    }


}
