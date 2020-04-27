package com.springdata.idgenerators;

import com.springdata.idgenerators.employee.entity.Employee;
import com.springdata.idgenerators.employee.repository.Employeerepos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IdgeneratorsApplicationTests {

	@Autowired
	Employeerepos employeerepos;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate()
	{
		Employee employee1=new Employee();
//		employee1.setId(1);
		employee1.setName("preeti");

		employeerepos.save(employee1);

		Employee employee2=new Employee();
//		employee2.setId(2);
		employee2.setName("rohit");

		employeerepos.save(employee2);

		Employee employee3=new Employee();
//		employee3.setId(3);
		employee3.setName("ankit");

		employeerepos.save(employee3);
	}

}
