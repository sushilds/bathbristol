package com.bathbristol.datamodel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Company {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("size")
	private String size;
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("founded")
	private String founded;
	
	@JsonProperty("industry")
	private String industry;
	
	@JsonProperty("location")
	private Location location;	
	
	@JsonProperty("linkedin_url")
	private String linkedinUrl;
	
	@JsonProperty("linkedin_id")
	private String linkedinId;
	
	@JsonProperty("facebook_url")
	private String facebookUrl;
	
	@JsonProperty("twitter_url")
	private String twitterUrl;
	
	@JsonProperty("website")
	private String website;
	
}

