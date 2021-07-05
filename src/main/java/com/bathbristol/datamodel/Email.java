package com.bathbristol.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Email {

	@JsonProperty("address")
	private String address;
	
	@JsonProperty("type")
	private String type;
	
}
