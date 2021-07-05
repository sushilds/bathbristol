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
@Table(name="profile",schema = "bath_bristol")
@Data
public class ProfileBean implements Serializable{
	@Id
	@Column(name = "profile_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer profileId;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "prof_map_id")
	private MainBean mainBean;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "network")
	private String network;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "username")
	private String username;

}
