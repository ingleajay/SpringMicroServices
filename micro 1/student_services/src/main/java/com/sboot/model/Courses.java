package com.sboot.model;

public class Courses {

	private int cid;
	private String cname;
	private String categeory;
	
	private int stuid;

	public Courses(int cid, String cname, String categeory, int stuid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.categeory = categeory;
		this.stuid = stuid;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCategeory() {
		return categeory;
	}

	public void setCategeory(String categeory) {
		this.categeory = categeory;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", cname=" + cname + ", categeory=" + categeory + ", stuid=" + stuid + "]";
	}
	
	
}
