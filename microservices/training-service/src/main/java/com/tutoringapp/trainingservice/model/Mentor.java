package com.tutoringapp.trainingservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mentor")
public class Mentor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "linkedin_url")
	private String linkedinUrl;

	@Column(name = "years_of_experience")
	private Float yearsOfExperience;

	@Column(name = "active")
	private Boolean active = false;
	
	@OneToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	public Mentor(){
		
	}
	public Mentor(String linkedinUrl, Float yearsOfExperience, Boolean active) {
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public Float getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(Float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Mentor [id=" + id + ", linkedinUrl=" + linkedinUrl + ", yearsOfExperience=" + yearsOfExperience
				+ ", active=" + active + ", user=" + user + "]";
	}
	
	
}
