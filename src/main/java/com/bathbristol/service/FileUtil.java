package com.bathbristol.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bathbristol.dao.MainBeanRepository;
import com.bathbristol.datamodel.Company;
import com.bathbristol.datamodel.Education;
import com.bathbristol.datamodel.EducationBean;
import com.bathbristol.datamodel.Email;
import com.bathbristol.datamodel.EmailBean;
import com.bathbristol.datamodel.Experience;
import com.bathbristol.datamodel.ExperienceBean;
import com.bathbristol.datamodel.JsonBean;
import com.bathbristol.datamodel.Location;
import com.bathbristol.datamodel.MainBean;
import com.bathbristol.datamodel.ProfileBean;
import com.bathbristol.datamodel.Profiles;
import com.bathbristol.datamodel.Title;
import com.bathbristol.datamodel.VersionStatus;

import ch.qos.logback.core.Context;

@Service
public class FileUtil {

	@Autowired
	MainBeanRepository mainBeanRepository;

	private static Logger logger = LogManager.getLogger(FileUtil.class);

	public void saveJsonToDb(JsonBean jsonBean) {
		try {
			setMainBean(jsonBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception in saveJsonToDB", e);
			e.printStackTrace();
		}
	}

	private void setMainBean(JsonBean jsonBean) {
		try {
			MainBean mainBean = new MainBean();
			mainBean.setId(jsonBean.getId());
			mainBean.setFirstName(jsonBean.getFirstName());
			mainBean.setFullName(jsonBean.getFullName());
			mainBean.setMiddleName(jsonBean.getMiddleName());
			mainBean.setMiddleInitial(jsonBean.getMiddleInitial());
			mainBean.setLastName(jsonBean.getLastName());
			mainBean.setGender(jsonBean.getGender());
			mainBean.setBirthDate(jsonBean.getBirthDate());
			mainBean.setBirthYear(jsonBean.getBirthYear());
			mainBean.setLinkedinId(jsonBean.getLinkedinId());
			mainBean.setLinkedinUrl(jsonBean.getLinkedinUrl());
			mainBean.setLinkedinUsername(jsonBean.getLinkedinUsername());
			mainBean.setFacebookId(jsonBean.getFacebookId());
			mainBean.setFacebookUrl(jsonBean.getFacebookUrl());
			mainBean.setFacebookUsername(jsonBean.getFacebookUsername());
			mainBean.setTwitterurl(jsonBean.getTwitterUrl());
			mainBean.setTwitterUsername(jsonBean.getTwitterUsername());
			mainBean.setGithubUrl(jsonBean.getGithubUrl());
			mainBean.setGithubUsername(jsonBean.getGithubUsername());
			mainBean.setWorkEmail(jsonBean.getWorkEmail());
			mainBean.setMobilePhone(jsonBean.getMobilePhone());
			mainBean.setIndustry(jsonBean.getIndustry());

			mainBean.setJobTitle(jsonBean.getJobTitle());
			mainBean.setJobTitleRole(jsonBean.getJobTitleRole());
			mainBean.setJobTitleSubRole(jsonBean.getJobTitleSubRole());
			String levels = jsonBean.getJobTitleLevels().stream().map(Object::toString)
					.collect(Collectors.joining(", "));
			mainBean.setJobTitleLevels(levels);

			mainBean.setJobCompanyName(jsonBean.getJobCompanyName());
			mainBean.setJobCompanySize(jsonBean.getJobCompanySize());
			mainBean.setJobCompanyId(jsonBean.getJobCompanyId());
			mainBean.setJobCompanyFounded(jsonBean.getJobCompanyFounded());
			mainBean.setJobCompanyIndustry(jsonBean.getJobCompanyIndustry());
			mainBean.setJobCompanyFacebookUrl(jsonBean.getJobCompanyFacebookUrl());
			mainBean.setJobCompanyLinkedinId(jsonBean.getJobCompanyLinkedinId());
			mainBean.setJobCompanyLinkedinUrl(jsonBean.getJobCompanyLinkedinUrl());
			mainBean.setJobCompanyTwitterUrl(jsonBean.getJobCompanyTwitterUrl());
			mainBean.setJobCompanyWebsite(jsonBean.getJobCompanyWebsite());

			mainBean.setJobCompanyLocationAddressLine2(jsonBean.getJobCompanyLocationAddressLine2());
			mainBean.setJobCompanyLocationContinent(jsonBean.getJobCompanyLocationContinent());
			mainBean.setJobCompanyLocationCountry(jsonBean.getJobCompanyLocationCountry());
			mainBean.setJobCompanyLocationGeo(jsonBean.getJobCompanyLocationGeo());
			mainBean.setJobCompanyLocationLocality(jsonBean.getJobCompanyLocationLocality());
			mainBean.setJobCompanyLocationStreetAddress(jsonBean.getJobCompanyLocationStreetAddress());
			mainBean.setJobCompanyLocationRegion(jsonBean.getJobCompanyLocationRegion());
			mainBean.setJobCompanyLocationPostalCode(jsonBean.getJobCompanyLocationPostalCode());
			mainBean.setJobCompanyLocationName(jsonBean.getJobCompanyLocationName());

			mainBean.setLocationAddressLine2(jsonBean.getLocationAddressLine2());
			mainBean.setLocationContinent(jsonBean.getLocationContinent());
			mainBean.setLocationCountry(jsonBean.getLocationCountry());
			mainBean.setLocationGeo(jsonBean.getLocationGeo());
			mainBean.setLocationLocality(jsonBean.getLocationLocality());
			mainBean.setLocationStreetAddress(jsonBean.getLocationStreetAddress());
			mainBean.setLocationRegion(jsonBean.getLocationRegion());
			mainBean.setLocationPostalCode(jsonBean.getLocationPostalCode());
			mainBean.setLocationName(jsonBean.getLocationName());
			mainBean.setLocationLastUpdated(jsonBean.getLocationLastUpdated());

			mainBean.setJobSummary(jsonBean.getJobSummary());
			mainBean.setJobLastUpdated(jsonBean.getJobLastUpdated());
			mainBean.setJobStartDate(jsonBean.getJobStartDate());

			mainBean.setSummary(jsonBean.getSummary());
			mainBean.setInferredSalary(jsonBean.getInferredSalary());
			mainBean.setInferredYearsExperience(jsonBean.getInferredYearsExperience());

			String phoneNumbers = jsonBean.getPhoneNumbers().stream().map(Object::toString)
					.collect(Collectors.joining(", "));
			mainBean.setPhoneNumbers(phoneNumbers);
			
			Set<EmailBean> emailList= setEmailBean(jsonBean.getEmails());
		    mainBean.setEmailList(emailList);
			 

			String skills = jsonBean.getSkills().stream().map(Object::toString).collect(Collectors.joining(", "));
			mainBean.setSkills(skills);

			String interests = jsonBean.getInterests().stream().map(Object::toString).collect(Collectors.joining(", "));
			mainBean.setInterests(interests);

			String locationNames = jsonBean.getLocationNames().stream().map(Object::toString)
					.collect(Collectors.joining(", "));
			mainBean.setLocationNames(locationNames);

			String regions = jsonBean.getRegions().stream().map(Object::toString).collect(Collectors.joining(", "));
			mainBean.setRegions(regions);

			String countries = jsonBean.getCountries().stream().map(Object::toString).collect(Collectors.joining(", "));
			mainBean.setCountries(countries);

			String streetAddress = jsonBean.getStreetAddresses().stream().map(Object::toString)
					.collect(Collectors.joining(", "));
			mainBean.setStreetAddresses(streetAddress);

			
			  Set<ExperienceBean> expList= setExperienceBean(jsonBean.getExperience());
			  mainBean.setExperiences(expList);
			  
			  Set<EducationBean> educations= setEducationBean(jsonBean.getEducation());
			  mainBean.setEducations(educations);
			  
			  Set<ProfileBean> profileList= setProfileBean(jsonBean.getProfiles());
			  mainBean.setProfiles(profileList);
			 

			VersionStatus vs = jsonBean.getVersionStatus();

			mainBean.setVersionStatus(vs.getStatus());
			mainBean.setPreviousVersion(vs.getPreviousVersion());
			mainBean.setCurrentVersion(vs.getCurrentVersion());

			String versionContains = vs.getContains().stream().map(Object::toString).collect(Collectors.joining(", "));
			mainBean.setVersionContains(versionContains);

			saveMainBean(mainBean);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception occured while main bean", e);
			e.printStackTrace();
		}
	}

	private void saveMainBean(MainBean mainBean) {
		// TODO Auto-generated method stub
		try {
			mainBeanRepository.save(mainBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception while saving main bean to Database", e);
			e.printStackTrace();
		}

	}

	private Set<ExperienceBean> setExperienceBean(List<Experience> experiences) {
		try {
			Set<ExperienceBean> experienceBeanList = new HashSet<ExperienceBean>();
			for (Experience experience : experiences) {

				Company company = experience.getCompany();
				Location location = company.getLocation();
				Title title = experience.getTitle();
				ExperienceBean expBean = new ExperienceBean();

				// Title
				expBean.setTitleName(title.getName());
				expBean.setTitleRole(title.getRole());
				expBean.setTitleSubRole(title.getSubRole());
				String levels = title.getLevels().stream().map(Object::toString).collect(Collectors.joining(", "));
				expBean.setTitleLevel(levels);

				// location
				expBean.setAddressLine2(location.getAddressLine2());
				expBean.setContinent(location.getContinent());
				expBean.setCountry(location.getCountry());
				expBean.setGeo(location.getGeo());
				expBean.setLocality(location.getLocality());
				expBean.setStreetAddress(location.getStreetAddress());
				expBean.setRegion(location.getRegion());
				expBean.setPostalCode(location.getPostalCode());
				expBean.setName(location.getName());

				// company
				expBean.setName(company.getName());
				expBean.setSize(company.getSize());
				expBean.setId(company.getId());
				expBean.setFounded(company.getFounded());
				expBean.setIndustry(company.getIndustry());
				expBean.setFacebookUrl(company.getFacebookUrl());
				expBean.setLinkedinId(company.getLinkedinId());
				expBean.setLinkedinUrl(company.getLinkedinUrl());
				expBean.setTwitterUrl(company.getTwitterUrl());
				expBean.setWebsite(company.getWebsite());

				// experience
				expBean.setSummary(experience.getSummary());
				expBean.setIsPrimary(experience.getIsPrimary());
				expBean.setEndDate(experience.getEndDate());
				expBean.setStartDate(experience.getStartDate());

				String locNames = experience.getLocationNames().stream().map(Object::toString)
						.collect(Collectors.joining(", "));
				expBean.setLocationNames(locNames);
				experienceBeanList.add(expBean);
			}
			return experienceBeanList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception occured while setting experience bean", e);
			e.printStackTrace();
		}
		return null;
	}

	private Set<EducationBean> setEducationBean(List<Education> educations) {
		try {
			Set<EducationBean> educationBeanList = new HashSet<EducationBean>();
			for (Education education : educations) {
				EducationBean educationBean = new EducationBean();
				educationBean.setMajors(education.getMajors());
				educationBean.setMinors(education.getMinors());
				educationBean.setDegrees(education.getDegrees());
				educationBean.setDomain(education.getDomain());
				educationBean.setGpa(education.getGpa());
				educationBean.setEndDate(education.getEndDate());
				educationBean.setStartDate(education.getStartDate());
				educationBean.setFacebookUrl(education.getFacebookUrl());
				educationBean.setLinkedinUrl(education.getLinkedinUrl());
				educationBean.setLinkedinId(education.getLinkedinId());
				educationBean.setLocation(education.getLocation());
				educationBean.setName(education.getName());
				educationBean.setEduId(education.getEduId());
				educationBean.setId(education.getId());
				educationBean.setSummary(education.getSummary());
				educationBean.setTwitterUrl(education.getTwitterUrl());
				educationBean.setType(education.getType());
				educationBean.setWebsite(education.getWebsite());

				educationBeanList.add(educationBean);
			}
			return educationBeanList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception occured while setting education bean", e);
			e.printStackTrace();
		}
		return null;
	}

	private Set<ProfileBean> setProfileBean(List<Profiles> profiles) {
		try {
			Set<ProfileBean> profileBeanList = new HashSet<ProfileBean>();
			for (Profiles profile : profiles) {
				ProfileBean profileBean = new ProfileBean();
				profileBean.setNetwork(profile.getNetwork());
				profileBean.setUrl(profile.getUrl());
				profileBean.setUsername(profile.getUsername());
				profileBean.setId(profile.getId());

				profileBeanList.add(profileBean);
			}
			return profileBeanList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception occured while setting profile bean", e);
			e.printStackTrace();
		}
		return null;
	}

	private Set<EmailBean> setEmailBean(List<Email> emails) {
		try {
			Set<EmailBean> emailBeanList = new HashSet<EmailBean>();
			for (Email email : emails) {
				EmailBean emailBean = new EmailBean();
				emailBean.setMailId(email.getAddress());
				emailBean.setType(email.getType());

				emailBeanList.add(emailBean);
			}
			return emailBeanList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception occured while setting email bean", e);
			e.printStackTrace();
		}
		return null;
	}

}
