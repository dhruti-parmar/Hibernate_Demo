package com.hibernate.model;

import jakarta.persistence.Embeddable;

@Embeddable //add in existing table don't create new table like entity
public class UserName {
	private String fname;
	private String lname;
	private String mname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "UserName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
	}

}
