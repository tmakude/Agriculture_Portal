package com.backend.Agriculture.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Agriculture.entities.Category;
import com.backend.Agriculture.entities.Product;
import com.backend.Agriculture.entities.Seller;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findBySeller(Seller seller);

	List<Product> findByCategory(Category category);
	
}
