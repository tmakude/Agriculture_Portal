package com.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CartDTO {
	
    private int productId;
	
	private String categoryName;
	
	private String priductname;
	
	private double price;
	
	private int qty;

}
