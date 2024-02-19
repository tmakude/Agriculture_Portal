package com.app.entities;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Setter
@Getter
public class Seller extends BaseEntity {
	
	@Column(nullable = false)
	private long phone;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "sellerId")
	private List<Product> product = new ArrayList<>();
	
	public Seller(long phone,String name, String email, String pswd) {
		this.phone = phone;
		this.name = name;
		this.email = email;
		this.password = pswd;
	}
	
	@Override
	public String toString() {
		return "Seller: "+super.getId()+"   "+name+"   "+email+"   "+phone+" \n";
	}
}










//
//@Entity
//@Getter
//@Setter
//public class Seller extends BaseEntity {
//
//    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
//    private List<Product> products = new ArrayList<>();
//    
//    // Other fields, constructors, toString method
//}