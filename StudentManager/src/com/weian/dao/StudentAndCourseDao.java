package com.weian.dao;
/**
 * 关系表的方法
 * @author Weian
 *
 */
public interface StudentAndCourseDao {

	//添加选这门课程的学生
	void addStuCourse(String stuId,int cId);
	
	//删除选这门课程的学生
	void deleteStuCourse(String stuId,int cId);
}
