package com.bathbristol.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Location {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("locality")
	private String locality;
	
	@JsonProperty("region")
	private String region;
	
	@JsonProperty("country")
	private String country;
	
	@JsonProperty("continent")
	private String continent;
	
	@JsonProperty("street_address")
	private String streetAddress;
	
	@JsonProperty("address_line_2")
	private String addressLine2;
	
	@JsonProperty("postal_code")
	private String postalCode;
	
	@JsonProperty("geo")
	private String geo;
}

