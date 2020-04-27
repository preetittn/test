package com.jpa.springdata.jpa;

import com.jpa.springdata.jpa.product.Product;
import com.jpa.springdata.jpa.product_repos.Productrepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class JpaApplicationTests {

	@Autowired
	Productrepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate()
	{
		Product product=new Product();
		product.setId(3);
		product.setName("refrigerator");
		product.setDesc("lg");
		product.setPrice(5000d);

		repository.save(product);
	}

	@Test
	public void testRead() {
		Optional<Product> product = repository.findById(3);
		assertNotNull(product);
		assertEquals("refrigerator", product.get().getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + product.get().getName());
	}

	@Test
	public void testUpdate()
	{
		Optional<Product> product=repository.findById(3);
		product.get().setPrice(7000d);
		repository.save(product.get());				//ek baar toh findone ka fir save khud karega(select query) se
	}

	@Test
	public void testDelete()
	{
		if(repository.existsById(1));//repository.delete(1);
		System.out.println("deleting");
		repository.deleteById(3);
	}

	@Test
	public void testCount()			//count number of rows
	{
		System.out.println("total records>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+repository.count());
	}


	@Test
	public void testpaging()
	{
		Pageable pageable =  PageRequest.of(0,1);
		Page<Product> results=repository.findAll(pageable);
		results.forEach(p -> System.out.println(p.getName()));
	}

	@Test
	public void testfindAllSorting()
	{
		repository.findAll(Sort.by(Sort.Direction.DESC,"name","price")).forEach(p -> System.out.println(p.getName()));
	}


	@Test
	public void testFindAllPagingAndSorting()
	{
		Pageable pageable= PageRequest.of(0,2, Sort.Direction.DESC,"name");
		repository.findAll(pageable).forEach(p -> System.out.println(p.getName()));
	}
}
