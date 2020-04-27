package com.jpa.springdata.jpa2;

import com.jpa.springdata.jpa2.Employee.Repository.Employeerepos;
import com.jpa.springdata.jpa2.Employee.entity.Address;
import com.jpa.springdata.jpa2.Employee.entity.RegularEmployee;
import com.jpa.springdata.jpa2.Employee.entity.TraineeEmployee;
import com.jpa.springdata.jpa2.Student.Repository.Studentrepos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Jpa2Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext=SpringApplication.run(Jpa2Application.class, args);
//		Studentrepos studentrepos=applicationContext.getBean(Studentrepos.class);


		Employeerepos employeerepos=applicationContext.getBean(Employeerepos.class);


		employeerepos.save(new RegularEmployee("preeti",10000,"project1",new Address("city1","state1")));
		employeerepos.save(new RegularEmployee("ambika",10000,"project1",new Address("city1","state1")));


		employeerepos.save(new TraineeEmployee("gaurav",20000,90,new Address("city1","state1")));
		employeerepos.save(new TraineeEmployee("sharmendra",20000,90,new Address("city1","state1")));


		System.out.println(employeerepos.findById(1));
		System.out.println(employeerepos.findById(2));
		System.out.println(employeerepos.findById(3));
		System.out.println(employeerepos.findById(4));

	}

}
