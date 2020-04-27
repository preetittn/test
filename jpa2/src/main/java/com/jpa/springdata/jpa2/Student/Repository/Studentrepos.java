package com.jpa.springdata.jpa2.Student.Repository;

import com.jpa.springdata.jpa2.Student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Studentrepos extends CrudRepository<Student,Integer> {

    @Query("from Student")
    List<Student> findAllStudent();
}
