package com.sboot.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	 
	private Long stuid;
	private String stuname;
	private String stuphone;
	
	List<Courses> courses = new ArrayList<>();

	public Student(Long stuid, String stuname, String stuphone, List<Courses> courses) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuphone = stuphone;
		this.courses = courses;
	}

	public Student(Long stuid, String stuname, String stuphone) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuphone = stuphone;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return stuid;
	}

	public void setId(Long stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStuphone() {
		return stuphone;
	}

	public void setStuphone(String stuphone) {
		this.stuphone = stuphone;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + stuid + ", stuname=" + stuname + ", stuphone=" + stuphone + "]";
	}
	
	
	
	
}
