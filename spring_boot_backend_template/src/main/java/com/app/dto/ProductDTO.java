package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
	@JsonProperty(access = Access.READ_ONLY)
	private int sellerId;
	@NotBlank
	private String productname;
	@NotBlank
	private String categoryName;
	@NotBlank
	private double price;
	@Lob
	private Byte[] photo;
	@NotBlank
	private LocalDate manufacteDate;
	@NotBlank
	private String description;
	

}
