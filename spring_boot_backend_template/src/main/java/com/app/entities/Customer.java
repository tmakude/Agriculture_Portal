package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.*;

@Entity
@Getter
@Setter
public class Customer extends BaseEntity{
	
	
	
	@NotBlank
	private String name;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String pswd;
	
	@Column(nullable = false)
	private long phone;
	
	@Column(name = "create_date", insertable = true, updatable = false)
	private LocalDate createDate;
	
	@Column(nullable = false)
	private String gender;
	
	public Customer(String name, String email, String pswd, long phone, String gender) {
		this.name = name;
		this.email = email;
		this.pswd = pswd;
		this.phone = phone;
		this.gender = gender;
        createDate = LocalDate.now();
	}
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
	private List<Address> address = new ArrayList<>();
	
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
	private List<Feedback> feedback = new ArrayList<>();
	
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
	private List<Order_detail> orders = new ArrayList<>();
	
	@OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
	private List<Payment> payments = new ArrayList<>();
	public String toString() {
		return "Customer: "+super.getId()+"   "+name+"   "+email+"   "+phone+"   "+gender+"   "+createDate+"   "+address.toString()+" \n"; //here we can write only address instead of address.toString()
	}
}









//
//@Entity
//@Getter
//@Setter
//public class Customer extends BaseEntity {
//
//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private List<Address> addresses = new ArrayList<>();
//    
//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private List<Feedback> feedbacks = new ArrayList<>();
//    
//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private List<Order_detail> orders = new ArrayList<>();
//    
//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private List<Payment> payments = new ArrayList<>();
//    
//    // Other fields, constructors, toString method
//}