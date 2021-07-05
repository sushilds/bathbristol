package com.bathbristol.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Profiles {
	
	@JsonProperty("network")
	private String network;
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("username")
	private String username;
	
}