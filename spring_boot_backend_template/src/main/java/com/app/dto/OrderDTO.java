package com.app.dto;

import com.app.entities.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
	@JsonProperty(access = Access.READ_ONLY)
    private int id;
	
	private Product product;
	
	private int qty;
	

}
