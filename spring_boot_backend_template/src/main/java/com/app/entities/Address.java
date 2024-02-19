package com.app.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address extends BaseEntity{
	
	private String city;
	
	private String state;
	
	private String zip;
	
	private String country;
	
	@ManyToOne//(fetch=FetchType.LAZY) its by default
	@JoinColumn(name = "customer_id")        
	private Customer customerId;
	
	public Address(String city, String state, String zip, String country){
		this.state = state;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Address: "+city+"   "+state+"   "+country+"   "+zip+"  \n";
	}
}










//
//@Entity
//@Getter
//@Setter
//public class Address extends BaseEntity {
//
//    private String city;
//    
//    private String state;
//    
//    private String zip;
//    
//    private String country;
//    
//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Customer customer;
//    
//    // Constructors, toString method
//}