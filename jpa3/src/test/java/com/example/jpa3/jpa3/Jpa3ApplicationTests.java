package com.example.jpa3.jpa3;

import com.example.jpa3.jpa3.associations.onetomany.entities.Customer;
import com.example.jpa3.jpa3.associations.onetomany.entities.Phonenumber;
import com.example.jpa3.jpa3.associations.onetomany.repository.Customerrepos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class Jpa3ApplicationTests {


	@Autowired
	Customerrepos customerrepos;
	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate()
	{
		Customer customer=new Customer();
		customer.setName("preeti");
		HashSet<Phonenumber> phonenumbers=new HashSet<>();

		Phonenumber ph1=new Phonenumber();
		ph1.setNumber("987654321");
		ph1.setType("cell");
		phonenumbers.add(ph1);


		Phonenumber ph2=new Phonenumber();
		ph2.setNumber("01126643397");
		ph2.setType("home");
		phonenumbers.add(ph2);

		customer.setNumbers(phonenumbers);

		customerrepos.save(customer);

	}

	@Test
	@Transactional
	public void testLoadCustomer()
	{
		Optional<Customer> customer=customerrepos.findById(4);
		System.out.println((customer.get().getName()));


		Set<Phonenumber> phonenumbers=Customer.
	}
}
