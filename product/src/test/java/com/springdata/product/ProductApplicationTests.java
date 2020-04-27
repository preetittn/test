package com.springdata.product;

import com.springdata.product.product.entities.Product;
import com.springdata.product.product.repository.Productrepos;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProductApplicationTests {

@Autowired
	Productrepos productrepos;

	@Test
	void contextLoads() {
	}


	//CRUD OPERATIONS
	@Test
	public void testCreate()
	{
		Product product=new Product();
		product.setId(4);
		product.setName("mask");
		product.setDesc("medical");
		product.setPrice(300d);

		productrepos.save(product);
	}

	@Test
	public void testRead()
	{
		Optional<Product>product=productrepos.findById(1);
		assertNotNull(product);
		assertEquals("boost",product.get().getName());
		System.out.println("****************"+product.get().getDesc());
	}

	@Test
	public void testUpdate()
	{
		Optional<Product> product=productrepos.findById(1);
		product.get().setPrice(1000d);
		productrepos.save(product.get());
	}

	@Test
	public void testDelete() {
		if (productrepos.existsById(2)) {//check whether record exists
			System.out.println(("deleting**********************"));
			productrepos.deleteById(2);
		}
	}

	@Test
	public void testCount()
	{
		System.out.println("************************************"+productrepos.count());
	}


	//FINDER METHODS
@Test
	public void testFindByName()
	{
		List<Product> products= productrepos.findByName("boost");
		products.forEach(p-> System.out.println(p.getPrice()));
	}

	@Test
	public void testFindByNameAndDesc()
	{
		List<Product>products=productrepos.findByNameAndDesc("boost","energy");
		products.forEach(p-> System.out.println(p.getClass()));
	}

	@Test
	public void testFindByPriceGreaterThan()
	{
		List<Product> products=productrepos.findByPriceGreaterThan(50d);
		products.forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void findByDescContains()
	{
		List<Product> products=productrepos.findByDescContains("energy");
		products.forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void findByPriceBetween()
	{
		List<Product>products=productrepos.findByPriceBetween(30d,1000d);
		products.forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void findByDescLike()
	{
		List<Product> products=productrepos.findByDescLike("%e%");
		products.forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void findByIdIn()
	{
		List<Product> products=productrepos.findByIdIn(Arrays.asList(1,2,4));
		products.forEach(p-> System.out.println(p.getName()));
	}

	//Paging and sorting
	@Test
	public void findAllPaging()
	{
		Pageable pageable = PageRequest.of(2, 2);
		Page<Product> products=productrepos.findAll(pageable);
//		Page<Product> products = productrepos.findAll(new PageRequest(1, 20));
		products.forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void findAllSorting()
	{
		productrepos.findAll(Sort.by(Sort.Direction.DESC,"name")).forEach(p-> System.out.println(p.getName()));
	}
}
