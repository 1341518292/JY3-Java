package com.weian.entity;
/**
 * 成绩表的实体类
 * @author Weian
 */
public class Course {
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Course(int couId, String couName) {
		super();
		this.couId = couId;
		this.couName = couName;
	}

	private int couId;
	private String couName;
	
	
	public int getCouId() {
		return couId;
	}



	public void setCouId(int couId) {
		this.couId = couId;
	}



	public String getCouName() {
		return couName;
	}



	public void setCouName(String couName) {
		this.couName = couName;
	}



	@Override
	public String toString() {
		return "Course [couId=" + couId + ", couName=" + couName + "]";
	}
	
	
	
}
