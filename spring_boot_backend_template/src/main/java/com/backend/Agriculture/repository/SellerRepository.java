package com.backend.Agriculture.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Agriculture.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{

	Seller findByEmail(String email);
}

