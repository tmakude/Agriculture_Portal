package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class Product extends BaseEntity {
	@Column(nullable = false)
	private String name;
	
	
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Category category;
	
	@Column(nullable = false)
	private double price;
	
	@Lob
	private Byte[] image;
	
	@Column(name = "manf_date", insertable = true, updatable = false)
	private LocalDate manufacteDate;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order_detail orderId;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller sellerId;
	
	public Product(String name,Category category,double price) {
		this.name = name;
		this.category = category;
		this.price = price;
		manufacteDate = LocalDate.now();
	}
	
	@Override
	public String toString() {
		return " Product: "+name+"   "+"   "+category+"   "+price+"   "+manufacteDate+"\n";
	}
}






