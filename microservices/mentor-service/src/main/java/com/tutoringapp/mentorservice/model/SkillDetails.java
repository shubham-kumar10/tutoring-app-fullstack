package com.tutoringapp.mentorservice.model;

public class SkillDetails {
	
	private int skill_id;
	private int yearsOfExperience;
	private float self_rating;
	
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public float getSelf_rating() {
		return self_rating;
	}
	public void setSelf_rating(float self_rating) {
		this.self_rating = self_rating;
	}
	@Override
	public String toString() {
		return "SkillDetails [skill_id=" + skill_id + ", yearsOfExperience=" + yearsOfExperience + ", self_rating=" + self_rating
				+ "]";
	}
	
	

}
