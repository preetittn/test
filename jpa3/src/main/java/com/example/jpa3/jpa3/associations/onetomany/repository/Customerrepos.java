package com.example.jpa3.jpa3.associations.onetomany.repository;

import com.example.jpa3.jpa3.associations.onetomany.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface Customerrepos extends CrudRepository<Customer, Integer> {


}
