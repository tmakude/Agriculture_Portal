package com.backend.Agriculture.services;


import com.backend.Agriculture.entities.Address;

public interface AddressService {
	
	Address saveAddress(Address address);
	
	Address findAddress(int id);
}

