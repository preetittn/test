package com.springdata.product.product.repository;

import com.springdata.product.product.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//public interface Productrepos extends CrudRepository<Product,Integer>
public interface Productrepos extends PagingAndSortingRepository<Product,Integer>
{

    List<Product> findByName(String name);
    List<Product> findByNameAndDesc(String name,String desc );
    List<Product> findByPriceGreaterThan(double price);
    List<Product> findByDescContains(String Desc);
    List<Product> findByPriceBetween(Double price1,Double price2);
    List<Product> findByDescLike(String desc);
    List<Product> findByIdIn(List<Integer> id);
}
