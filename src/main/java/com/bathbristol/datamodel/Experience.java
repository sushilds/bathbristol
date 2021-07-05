package com.bathbristol.datamodel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Experience {

	@JsonProperty("company")
	private Company company;
	
	@JsonProperty("start_date")
	private String startDate;
	
	@JsonProperty("end_date")
	private String endDate;
	
	@JsonProperty("title")
	private Title title;
	
	@JsonProperty("location_names")
	private List<String> locationNames;
	
	@JsonProperty("is_primary")
	private String isPrimary;
	
	@JsonProperty("summary")
	private String summary;
	
}

