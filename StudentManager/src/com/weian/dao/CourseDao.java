package com.weian.dao;

import com.weian.entity.Course;

/**
 * 课程表的方法
 * @author Weian
 *
 */
public interface CourseDao {
	//增加一门课程
	void addCourse(Course c);
	
	//删除一门课程
	void deleteCourse(int couId);
	
	//修改一门课程
	void updateCourse(Course c);

	//查看所有课程
	void allCourse();
}
