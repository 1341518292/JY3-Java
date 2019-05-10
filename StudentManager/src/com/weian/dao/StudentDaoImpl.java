package com.weian.dao;
/**
 * ѧ���ӿڵ�ʵ����
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.weian.Constant.Constant;
import com.weian.entity.Student;


public class StudentDaoImpl  implements StudentDao{

	
	//���һ��ѧ����Ϣ
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
			System.out.println("��ӳɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//ɾ��һ��ѧ����Ϣ
	@Override
	public void deleteStu(String id) {
		String sql = "DELETE FROM student WHERE stuId = ?";
		try(
				
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				) {
			prepareStatement.setString(1, id);
			prepareStatement.executeUpdate();
			System.out.println("ɾ���ɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//�޸�һ��ѧ����Ϣ
	@Override
	public void updateStu(Student student) {
		String sql = "UPDATE student SET stuName = ? WHERE stuId = ?";
		try(
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				) {
		
			prepareStatement.setString(1, student.getStuName());
			prepareStatement.setString(2, student.getStuID());
			prepareStatement.executeUpdate();
			System.out.println("�޸ĳɹ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//����һ��ѧ����Ϣ
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
	
	
	//��������ѧ����Ϣ
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

	//ͨ��ѧ����������ѧ��ѡ�����
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

	//ͨ���γ̺ţ�����ѧ����Ϣ
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
