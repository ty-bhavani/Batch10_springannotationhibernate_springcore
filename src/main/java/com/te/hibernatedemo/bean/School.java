package com.te.hibernatedemo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
	@Id
	private int sid;
	
	private String sname;

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	

}
