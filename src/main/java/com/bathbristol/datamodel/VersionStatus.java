package com.bathbristol.datamodel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class VersionStatus {

	@JsonProperty("status")
	private String status;
	
	@JsonProperty("contains")
	private List<String> contains;
	
	@JsonProperty("previous_version")
	private String previousVersion;
	
	@JsonProperty("current_version")
	private String currentVersion;
	
}
