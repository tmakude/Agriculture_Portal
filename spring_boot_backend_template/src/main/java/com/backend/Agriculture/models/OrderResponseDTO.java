package com.backend.Agriculture.models;

import java.util.List;

import com.backend.Agriculture.entities.Orders;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponseDTO {

	private Orders order;
	
	private List<OrderDetailsDTO> details;
	
}