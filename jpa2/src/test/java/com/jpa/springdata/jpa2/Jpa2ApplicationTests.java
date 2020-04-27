package com.jpa.springdata.jpa2;

import com.jpa.springdata.jpa2.Student.Repository.Studentrepos;
import com.jpa.springdata.jpa2.Student.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jpa2ApplicationTests {

	@Autowired
	Studentrepos studentrepos;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateStudent()
	{
		Student student=new Student();
		student.setFirst_name("Preeti");
		student.setLast_name("Upadhyay");
		student.setScore(99);

		studentrepos.save(student);

		Student student2=new Student();
		student2.setFirst_name("Gaurav");
		student2.setLast_name("Upadhyay");
		student2.setScore(100);


		studentrepos.save(student2);

	}
}
