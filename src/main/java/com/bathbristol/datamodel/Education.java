package com.bathbristol.datamodel;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Education {
	
	@JsonProperty("edu_id")
	private String eduId;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("website")
	private String website;
	
	@JsonProperty("linkedin_url")
	private String linkedinUrl;
	
	@JsonProperty("linkedin_id")
	private String linkedinId;
	
	@JsonProperty("facebook_url")
	private String facebookUrl;
	
	@JsonProperty("twitter_url")
	private String twitterUrl;
	
    @JsonProperty("location")
	private String location;
	
	@JsonProperty("domain")
	private String domain;
	
	@JsonProperty("degrees")
	private String degrees;

	@JsonProperty("majors")
	private String majors;
	
	@JsonProperty("minors")
	private String minors;
	
	@JsonProperty("start_date")
	private String startDate;
	
	@JsonProperty("end_date")
	private String endDate;
	
	@JsonProperty("gpa")
	private String gpa;
	
	@JsonProperty("summary")
	private String summary;
}