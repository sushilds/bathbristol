package com.bathbristol.datamodel;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "main1", schema = "bath_bristol")
@Data
public class MainBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "main_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer mainId;

	@Column(name = "id")
	private String id;

	@Column(name = "job_company_location_geo")
	private String jobCompanyLocationGeo;

	@Column(name = "job_company_name")
	private String jobCompanyName;

	@Column(name = "birth_date")
	private String birthDate;

	@Column(name = "birth_year")
	private String birthYear;

	@Column(name = "middle_initial")
	private String middleInitial;

	@Column(name = "job_company_size")
	private String jobCompanySize;

	@Column(name = "linkedin_username")
	private String linkedinUsername;

	@Column(name = "job_company_location_locality")
	private String jobCompanyLocationLocality;

	@Column(name = "job_title")
	private String jobTitle;

	@Column(name = "facebook_url")
	private String facebookUrl;

	@Column(name = "job_company_id")
	private String jobCompanyId;

	@Column(name = "location_region")
	private String locationRegion;

	@Column(name = "location_street_address")
	private String locationStreetAddress;

	@Column(name = "location_address_line_2")
	private String locationAddressLine2;

	@Column(name = "job_company_location_postal_code")
	private String jobCompanyLocationPostalCode;

	@Column(name = "facebook_id")
	private String facebookId;

	@Column(name = "location_name")
	private String locationName;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "location_last_updated")
	private String locationLastUpdated;

	@Column(name = "version_contains")
	private String versionContains;

	@Column(name = "previous_version")
	private String previousVersion;

	@Column(name = "current_version")
	private String currentVersion;

	@Column(name = "version_status")
	private String versionStatus;

	@Column(name = "job_company_location_street_address")
	private String jobCompanyLocationStreetAddress;

	@Column(name = "job_company_founded")
	private String jobCompanyFounded;

	@Column(name = "linkedin_url")
	private String linkedinUrl;

	@Column(name = "work_email")
	private String workEmail;

	@Column(name = "job_company_location_region")
	private String jobCompanyLocationRegion;

	@Column(name = "job_company_website")
	private String jobCompanyWebsite;

	@Column(name = "gender")
	private String gender;

	@Column(name = "location_country")
	private String locationCountry;

	@Column(name = "facebook_username")
	private String facebookUsername;

	@Column(name = "twitter_username")
	private String twitterUsername;

	@Column(name = "job_company_location_country")
	private String jobCompanyLocationCountry;

	@Column(name = "github_username")
	private String githubUsername;

	@Column(name = "industry")
	private String industry;

	@Column(name = "location_geo")
	private String locationGeo;

	@Column(name = "job_company_location_address_line_2")
	private String jobCompanyLocationAddressLine2;

	@Column(name = "location_postal_code")
	private String locationPostalCode;

	@Column(name = "mobile_phone")
	private String mobilePhone;

	@Column(name = "location_continent")
	private String locationContinent;

	@Column(name = "location_locality")
	private String locationLocality;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "twitter_url")
	private String twitterurl;

	@Column(name = "job_company_location_continent")
	private String jobCompanyLocationContinent;

	@Column(name = "job_company_facebook_url")
	private String jobCompanyFacebookUrl;

	@Column(name = "job_company_linkedin_url")
	private String jobCompanyLinkedinUrl;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "linkedin_id")
	private String linkedinId;

	@Column(name = "job_last_updated")
	private String jobLastUpdated;

	@Column(name = "job_summary")
	private String jobSummary;

	@Column(name = "job_start_date")
	private String jobStartDate;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "job_company_twitter_url")
	private String jobCompanyTwitterUrl;

	@Column(name = "job_title_role")
	private String jobTitleRole;

	@Column(name = "job_title_sub_role")
	private String jobTitleSubRole;

	@Column(name = "job_company_linkedin_id")
	private String jobCompanyLinkedinId;

	@Column(name = "github_url")
	private String githubUrl;

	@Column(name = "job_company_industry")
	private String jobCompanyIndustry;

	@Column(name = "job_company_location_name")
	private String jobCompanyLocationName;

	@Column(name = "skills")
	private String skills;

	@Column(name = "job_title_levels")
	private String jobTitleLevels;

	@Column(name = "countries")
	private String countries;

	@Column(name = "location_names")
	private String locationNames;

	@Column(name = "regions")
	private String regions;

	@Column(name = "street_addresses")
	private String streetAddresses;

	@Column(name = "phone_numbers")
	private String phoneNumbers;

	@Column(name = "interests")
	private String interests;

	@Column(name = "inferred_salary")
	private String inferredSalary;

	@Column(name = "inferred_years_experience")
	private String inferredYearsExperience;

	@Column(name = "summary")
	private String summary;

	
  @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) 
  @JoinColumn(name = "email_map_id")
  private Set<EmailBean> emailList;
  
  @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) 
  @JoinColumn(name = "exp_map_id")
  private Set<ExperienceBean> experiences;
  
  @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) 
  @JoinColumn(name = "edu_map_id")
  private Set<EducationBean> educations;
  
  @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  @JoinColumn(name = "prof_map_id")
  private Set<ProfileBean> profiles;
	 
}
