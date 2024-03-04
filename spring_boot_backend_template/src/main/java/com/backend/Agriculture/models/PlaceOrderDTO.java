package com.backend.Agriculture.models;
import java.util.List;

import com.backend.Agriculture.entities.Address;
import com.backend.Agriculture.entities.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceOrderDTO {


	private Address address;
	
	private List<CartDTO> cart;
	
	private Payment payment;
	
	private int customerId;

}
