package com.bathbristol.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class JsonBean {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("full_name")
	private String fullName;
	
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("middle_initial")
	private String middleInitial;
	
	@JsonProperty("middle_name")
	private String middleName;
	
	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("birth_year")
	private String birthYear;

	@JsonProperty("birth_date")
	private String birthDate;

	@JsonProperty("linkedin_url")
	private String linkedinUrl;

	@JsonProperty("linkedin_username")
	private String linkedinUsername;

	@JsonProperty("linkedin_id")
	private String linkedinId;

	@JsonProperty("facebook_url")
	private String facebookUrl;

	@JsonProperty("facebook_username")
	private String facebookUsername;

	@JsonProperty("facebook_id")
	private String facebookId;

	@JsonProperty("twitter_url")
	private String twitterUrl;

	@JsonProperty("twitter_username")
	private String twitterUsername;

	@JsonProperty("github_url")
	private String githubUrl;

	@JsonProperty("github_username")
	private String githubUsername;

	@JsonProperty("work_email")
	private String workEmail;

	@JsonProperty("mobile_phone")
	private String mobilePhone;

	@JsonProperty("industry")
	private String industry;

	@JsonProperty("job_title")
	private String jobTitle;

	@JsonProperty("job_title_role")
	private String jobTitleRole;

	@JsonProperty("job_title_sub_role")
	private String jobTitleSubRole;

	@JsonProperty("job_title_levels")
	private List<String> jobTitleLevels;

	@JsonProperty("job_company_id")
	private String jobCompanyId;

	@JsonProperty("job_company_name")
	private String jobCompanyName;

	@JsonProperty("job_company_website")
	private String jobCompanyWebsite;

	@JsonProperty("job_company_size")
	private String jobCompanySize;

	@JsonProperty("job_company_founded")
	private String jobCompanyFounded;

	@JsonProperty("job_company_industry")
	private String jobCompanyIndustry;

	@JsonProperty("job_company_linkedin_url")
	private String jobCompanyLinkedinUrl;

	@JsonProperty("job_company_linkedin_id")
	private String jobCompanyLinkedinId;

	@JsonProperty("job_company_facebook_url")
	private String jobCompanyFacebookUrl;

	@JsonProperty("job_company_twitter_url")
	private String jobCompanyTwitterUrl;

	@JsonProperty("job_company_location_name")
	private String jobCompanyLocationName;

	@JsonProperty("job_company_location_locality")
	private String jobCompanyLocationLocality;

	@JsonProperty("job_company_location_region")
	private String jobCompanyLocationRegion;

	@JsonProperty("job_company_location_geo")
	private String jobCompanyLocationGeo;

	@JsonProperty("job_company_location_street_address")
	private String jobCompanyLocationStreetAddress;

	@JsonProperty("job_company_location_address_line_2")
	private String jobCompanyLocationAddressLine2;

	@JsonProperty("job_company_location_postal_code")
	private String jobCompanyLocationPostalCode;

	@JsonProperty("job_company_location_country")
	private String jobCompanyLocationCountry;

	@JsonProperty("job_company_location_continent")
	private String jobCompanyLocationContinent;

	@JsonProperty("job_last_updated")
	private String jobLastUpdated;

	@JsonProperty("job_start_date")
	private String jobStartDate;

	@JsonProperty("job_summary")
	private String jobSummary;

	@JsonProperty("location_name")
	private String locationName;

	@JsonProperty("location_locality")
	private String LocationLocality;

	@JsonProperty("location_region")
	private String locationRegion;

	@JsonProperty("location_country")
	private String locationCountry;

	@JsonProperty("location_continent")
	private String locationContinent;

	@JsonProperty("location_street_address")
	private String locationStreetAddress;

	@JsonProperty("location_address_line_2")
	private String locationAddressLine2;

	@JsonProperty("location_postal_code")
	private String locationPostalCode;

	@JsonProperty("location_geo")
	private String locationGeo;

	@JsonProperty("location_last_updated")
	private String locationLastUpdated;

	@JsonProperty("inferred_salary")
	private String inferredSalary;

	@JsonProperty("inferred_years_experience")
	private String inferredYearsExperience;
 
	@JsonProperty("summary")
	private String summary;

	@JsonProperty("phone_numbers")
	private List<String> phoneNumbers;

	@JsonProperty("emails")
	private List<Email> emails;

	@JsonProperty("interests")
	private List<String> interests;

	@JsonProperty("skills")
	private List<String> skills;

	@JsonProperty("location_names")
	private List<String> locationNames;

	@JsonProperty("regions")
	private List<String> regions;
	
	@JsonProperty("countries")
	private List<String> countries;

	@JsonProperty("street_addresses")
	private List<String> streetAddresses;

	@JsonProperty("experience")
	private List<Experience> experience;

	@JsonProperty("education")
	private List<Education> education;

	@JsonProperty("profiles")
	private List<Profiles> profiles;

	@JsonProperty("version_status")
	private VersionStatus versionStatus;


}
