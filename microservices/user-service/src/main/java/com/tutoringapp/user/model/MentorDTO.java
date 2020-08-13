package com.tutoringapp.user.model;

import java.util.List;

public class MentorDTO {
	
	private Mentor mentor;
	private List<SkillDetails> skills;
	
	
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	public List<SkillDetails> getSkills() {
		return skills;
	}
	public void setSkills(List<SkillDetails> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "MentorDTO [mentor=" + mentor + ", skills=" + skills + "]";
	}
	
	
	
	

}
