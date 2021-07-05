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

import lombok.Data;

@Entity
@Table(name="experience",schema = "bath_bristol")
@Data
public class ExperienceBean implements Serializable{

	@Id
	@Column(name = "exp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer experienceId;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "exp_map_id")
	private MainBean mainBean;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "postal_code")
	private String postalCode;
	
	@Column(name = "locality")
	private String locality;
	
	@Column(name = "founded")
	private String founded;
	
	@Column(name ="industry")
	private String industry;
	
	@Column(name ="lname")
	private String lName;
	
	@Column(name ="region")
	private String region;
	
	@Column(name = "country")
	private String country;
	
	@Column(name ="continent")
	private String continent;
	
	@Column(name ="street_address")
	private String streetAddress;
	
	@Column(name ="address_line_2")
	private String addressLine2;
	
	@Column(name = "geo")
	private String geo;
	
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
	
	@Column(name ="location_names")
	private String locationNames;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "end_date")
	private String endDate;
	
	@Column(name ="title_name")
	private String titleName;
	
	@Column(name ="title_role")
	private String titleRole;
	
	@Column(name ="title_sub_role")
	private String titleSubRole;
	
	@Column(name ="title_level")
	private String titleLevel;
	
	@Column(name ="is_primary")
	private String isPrimary;
	
	@Column(name ="summary")
	private String summary;
}
