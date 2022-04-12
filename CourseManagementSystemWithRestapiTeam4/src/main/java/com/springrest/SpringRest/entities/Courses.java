package com.springrest.SpringRest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	
	@Id
	private long id;
	private String title;
	private String duration;
	private long fee;
	
	public Courses(long id, String title, String duration, long fee) 
	{
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.fee = fee;
	}
	
	public Courses() 
	{
		super();
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public long getFee() {
		return fee;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	
	
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", duration=" + duration + ", fee=" + fee + "]";
	}
	
}
