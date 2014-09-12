package com.realty.base.model;

// Generated 2014-5-15 22:00:12 by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.Date;

/**
 * Research generated by hbm2java
 */
public class Research implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int reschId;
	private String title;
	private Integer reschcategoryId;
	private Date date;
	private Integer browses;
	private String contents;
	private String reschFile;

	public Research() {
	}

	public Research(int reschId, String title) {
		this.reschId = reschId;
		this.title = title;
	}

	public Research(int reschId, String title, Integer reschcategoryId,
			Date date, Integer browses, String contents,
			String reschFile) {
		this.reschId = reschId;
		this.title = title;
		this.reschcategoryId = reschcategoryId;
		this.date = date;
		this.browses = browses;
		this.contents = contents;
		this.reschFile = reschFile;
	}

	public int getReschId() {
		return this.reschId;
	}

	public void setReschId(int reschId) {
		this.reschId = reschId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getReschcategoryId() {
		return this.reschcategoryId;
	}

	public void setReschcategoryId(Integer reschcategoryId) {
		this.reschcategoryId = reschcategoryId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getBrowses() {
		return this.browses;
	}

	public void setBrowses(Integer browses) {
		this.browses = browses;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getReschFile() {
		return this.reschFile;
	}

	public void setReschFile(String reschFile) {
		this.reschFile = reschFile;
	}

}