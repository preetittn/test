package com.jpa.springdata.jpa2.Employee.Repository;

import com.jpa.springdata.jpa2.Employee.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface Employeerepos extends CrudRepository<Employee,Integer> {


}
