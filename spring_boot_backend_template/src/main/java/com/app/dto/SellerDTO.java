package com.app.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class SellerDTO {
	
	@JsonProperty(access = Access.READ_ONLY)
	private int sellerId;
	@NotBlank
	private long phone;
	@NotBlank
    private String name;
    @NotBlank
    @Email
	private String email;
	@NotBlank
    @JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	@NotBlank
	@JsonProperty(access = Access.WRITE_ONLY)
	private String confirmPassword;
	
	
	

}
