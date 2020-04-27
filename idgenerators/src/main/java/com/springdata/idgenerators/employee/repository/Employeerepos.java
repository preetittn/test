package com.springdata.idgenerators.employee.repository;

import com.springdata.idgenerators.employee.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface Employeerepos extends CrudRepository<Employee,Integer> {
}
