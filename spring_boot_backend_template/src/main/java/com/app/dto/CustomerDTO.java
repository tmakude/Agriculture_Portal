package com.app.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.app.entities.Order_detail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class CustomerDTO {
	

	@JsonProperty(access = Access.READ_ONLY)	
    private int id;
	@NotBlank
	private String name;
	@Email
	private String email;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String confirmPassword;
	
	private long phone;
	private String gender;
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDate crDate;
	private List<OrderDTO> orders;
	private List<AddressDTO> adr;

}
