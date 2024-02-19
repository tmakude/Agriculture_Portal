package com.app.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedbackDTO {
	
	@JsonProperty(access = Access.READ_ONLY)
	private int rating;
	@NotBlank
	private String message;
	private int customerId;
	

}
