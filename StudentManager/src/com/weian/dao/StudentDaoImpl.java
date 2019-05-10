package com.weian.dao;
/**
 * 学生接口的实现类
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.weian.Constant.Constant;
import com.weian.entity.Student;


public class StudentDaoImpl  implements StudentDao{

	
	//添加一条学生信息
	@Override
	public void addStu(Student student) {
		String sql = "INSERT INTO student VALUES(?,?,?,?)";
		try(	
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				) {
			prepareStatement.setString(1, student.getStuID());
			prepareStatement.setString(2, student.getStuName());
			prepareStatement.setInt(3, student.getStuAge());
			prepareStatement.setString(4, student.getStuSex());
			prepareStatement.executeUpdate();
			System.out.println("添加成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//删除一条学生信息
	@Override
	public void deleteStu(String id) {
		String sql = "DELETE FROM student WHERE stuId = ?";
		try(
				
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				) {
			prepareStatement.setString(1, id);
			prepareStatement.executeUpdate();
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//修改一条学生信息
	@Override
	public void updateStu(Student student) {
		String sql = "UPDATE student SET stuName = ? WHERE stuId = ?";
		try(
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				) {
		
			prepareStatement.setString(1, student.getStuName());
			prepareStatement.setString(2, student.getStuID());
			prepareStatement.executeUpdate();
			System.out.println("修改成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//查找一条学生信息
	@Override
	public Student OneStu(String id) {
		String sql = "SELECT * FROM student WHERE stuId = ?";
		Student student = new Student();
		ResultSet rs = null ;
		try(
				
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				
				) {
			prepareStatement.setString(1, id);
			 rs = prepareStatement.executeQuery();
			while(rs.next()) {
			student.setStuID(rs.getString(1));
			student.setStuName(rs.getString(2));
			student.setStuAge(rs.getInt(3));
			student.setStuSex(rs.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return student;
	}
	
	
	//查找所有学生信息
	@Override
	public List<Student> AllStu() {
		String sql = "SELECT * FROM student";
		List<Student> students = new ArrayList<>();

		try(
				
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				ResultSet rs = prepareStatement.executeQuery();

				) {
			while(rs.next()) {
				Student student = new Student();
				student.setStuID(rs.getString(1));
				student.setStuName(rs.getString(2));
				student.setStuAge(rs.getInt(3));
				student.setStuSex(rs.getString(4));
				students.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}

	//通过学生号来查找学生选课情况
	@Override
	public List<String> getCourse(String Stuid) {
		String sql = "SELECT couName FROM stuandcourse JOIN course ON cId = couId WHERE sId = ?";
		ResultSet rs = null;
		List<String> list = new ArrayList<>();
		try(
				
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				
				) {
			prepareStatement.setString(1,Stuid);
			rs = prepareStatement.executeQuery();
			while(rs.next()) {
				String string = rs.getString(1);
				list.add(string);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}

	//通过课程号，查找学生信息
	@Override
	public List<Student> getStu(int Couid) {
		String sql = "SELECT * FROM student JOIN stuandcourse ON stuId = sId WHERE cId = ?";
		List<Student> list = new ArrayList<>();
		ResultSet rs = null;
		try(
				
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				) {
			prepareStatement.setInt(1, Couid);
			rs = prepareStatement.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setStuID(rs.getString(1));
				student.setStuName(rs.getString(2));
				student.setStuAge(rs.getInt(3));
				student.setStuSex(rs.getString(4));
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
