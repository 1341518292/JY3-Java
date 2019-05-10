package com.weian.dao;
/**
 * 学生类的方法
 * @author Weian
 *
 */

import java.util.List;

import com.weian.entity.Student;

public interface StudentDao {
	
	//添加一条学生信息
	void addStu(Student student);
	
	//删除一条学生信息
	void deleteStu(String id);
	
	//修改学生信息
	void updateStu(Student student);
	
	//查询一条学生信息
	Student OneStu(String id);
	
	//查询全部学生信息
	List<Student> AllStu();

	//通过学生号来查找学生选课情况
	List<String> getCourse(String Stuid);
	
	//通过课程号，查找学生信息
	List<Student> getStu(int Couid);
	
	
}
