package com.backend.Agriculture.services;

import java.util.List;
import java.util.Optional;

import com.backend.Agriculture.entities.Seller;
import com.backend.Agriculture.models.SellerDto;

public interface SellerService {

	Seller registerSeller(SellerDto sellerDto);

	Seller validate(String email, String password);

	List<Seller> findAllSellers();

	Optional<Seller> findSellerById(int id);

	void updateProfile(Seller seller, int id);

	Seller findByEmail(String email);

	void resetPassword(Seller seller, String password);

}
