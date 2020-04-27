package com.jpa.springdata.jpa.product_repos;

import com.jpa.springdata.jpa.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//public interface Productrepository extends CrudRepository<Product,Integer> {
public interface Productrepository extends PagingAndSortingRepository<Product,Integer>{


}
