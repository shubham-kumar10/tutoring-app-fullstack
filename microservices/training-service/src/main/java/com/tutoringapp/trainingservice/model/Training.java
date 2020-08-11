package com.tutoringapp.trainingservice.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="training")
public class Training {
	
	@Id
	@NotNull
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@NotNull
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="mentor_id")
	private Mentor mentor;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skills skill;
	
	@NotNull
	@Column(name="status")
	@Size(max=20)
	private String status;
	
	@NotNull
	@Column(name="progress")
	private int progress;
	
	@Column(name="rating")
	private float rating;
	
	@NotNull
	@Column(name="start_date")
	private Date startDate;
	
	@NotNull
	@Column(name="end_date")
	private Date endDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public Skills getSkill() {
		return skill;
	}

	public void setSkill(Skills skill) {
		this.skill = skill;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Training [id=" + id + ", user=" + user + ", mentor=" + mentor + ", skill=" + skill + ", status="
				+ status + ", progress=" + progress + ", rating=" + rating + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	
}
