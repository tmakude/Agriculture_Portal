package com.backend.Agriculture.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Agriculture.entities.Address;
import com.backend.Agriculture.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepo;
	
	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepo.save(address);
	}

	@Override
	public Address findAddress(int id) {
		// TODO Auto-generated method stub
		Optional<Address> address=addressRepo.findById(id);
		return address.get() ;
	}


}
