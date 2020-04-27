package com.jpa.springdata.jpa2.Employee.entity;

import javax.persistence.*;

//@Inheritance(InheritanceType.SINGLE_TABLE)            //single_table          //drawback:stores many null values
//@DiscriminatorColumn(name = "emp_type",discriminatorType = DiscriminatorType.STRING)    //single_table


@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)            //table_per_class      //drawback:does not follow normalization

@Entity
public abstract class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private String name;
    private int salary;

//    @Embedded
//    private  Address address;

    public Employee( String name, int salary) {

        this.name = name;
        this.salary = salary;
    }

    public Employee() {}


//    public void setAddress(Address address) {
//        this.address = address;
//    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
//                ", address=" + address +
                '}';
    }


}
