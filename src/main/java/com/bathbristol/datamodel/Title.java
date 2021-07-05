package com.bathbristol.datamodel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Title {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("role")
	private String role;
	
	@JsonProperty("sub_role")
	private String subRole;
	
	@JsonProperty("levels")
	private List<String> levels;
	
}
