package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;

import lombok.*;

@Entity
@Setter
@Getter
public class Order_detail extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customerId;
	
	@OneToMany(mappedBy = "orderId",cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<>();
	
	@Column(name = "order_date")
	private LocalDate orderDate;
	
	@DecimalMin(value = "0.00")
	private double payment;
	
	private int quantity;
	
	public Order_detail(int quantity) {
		this.quantity = quantity;
	}
	
	//helper methods
	public boolean addProduct(Product p) {
		boolean flag = false;
		products.add(p);
		payment = p.getPrice()*quantity;
		flag = true;
		return flag;
	}
	
	public boolean removeProduct(Product p) {
		boolean flag = false;
		products.remove(p);
		flag = true;
		return flag;
	}
	
	@Override
	public String toString() {
		return "orders: "+this.products+"    quantity: "+this.quantity+"   Amount: "+this.payment;
	}
}









//@Entity
//@Getter
//@Setter
//public class Order_detail extends BaseEntity {
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Customer customer;
//    
//    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
//    private List<Product> products = new ArrayList<>();
//    
//    // Other fields, constructors, helper methods, toString method
//}
