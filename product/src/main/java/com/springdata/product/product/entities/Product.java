package com.springdata.product.product.entities;

import javax.persistence.*;


@Entity
public class Product {

    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    @Column(name = "description")
    private String desc;
    private Double price;

    public int getId(int i) {
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
