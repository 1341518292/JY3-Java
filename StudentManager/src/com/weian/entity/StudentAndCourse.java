package com.weian.entity;
/**
 * 关联学生表与课程表
 * @author Weian
 *
 */
public class StudentAndCourse {
	
	public StudentAndCourse() {
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentAndCourse(String sId, Integer cId) {
		super();
		this.sId = sId;
		this.cId = cId;
	}


	private String sId;
	private Integer cId;
	public String getsId() {
		return sId;
	}


	public void setsId(String sId) {
		this.sId = sId;
	}


	public Integer getcId() {
		return cId;
	}


	public void setcId(Integer cId) {
		this.cId = cId;
	}


	@Override
	public String toString() {
		return "StudentAndCourse [sId=" + sId + ", cId=" + cId + "]";
	}
	
	
	
}
