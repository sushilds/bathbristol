package com.bathbristol.datamodel;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Table(name="education",schema = "bath_bristol")
@Data
public class EducationBean implements Serializable{
	@Id
	@Column(name = "education_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "edu_map_id")
	private MainBean mainBean;
	
	@Column(name = "eduid")
	private String eduId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "website")
	private String website;
	
	@Column(name ="linkedin_url")
	private String linkedinUrl;
	
	@Column(name ="linkedin_id")
	private String linkedinId;
	
	@Column(name ="facebook_url")
	private String facebookUrl;
	
	@Column(name ="twitter_url")
	private String twitterUrl;
	
    @Column(name = "location")
	private String location;
	
	@Column(name = "domain")
	private String domain;
	
	@Column(name = "degrees")
	private String degrees;

	@Column(name = "majors")
	private String majors;
	
	@Column(name = "minors")
	private String minors;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "end_date")
	private String endDate;
	
	@Column(name = "gpa")
	private String gpa;
	
	@Column(name = "summary")
	private String summary;
}
