package com.weian.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.weian.entity.Course;
import com.weian.util.DBUtils;

/**
 * �γ̽ӿڵ�ʵ����
 * @author Weian
 *
 */
public class CourseDaoImpl implements CourseDao{
	
	private static final Connection CONN = DBUtils.getConnection();
	
	//���һ�ſγ�
	@Override
	public void addCourse(Course c) {
		String sql = "INSERT INTO course VALUES(?,?)";
			try(
				
				PreparedStatement prepareStatement = CONN.prepareStatement(sql);

					) {
				prepareStatement.setInt(1, c.getCouId());
				prepareStatement.setString(2, c.getCouName());
				prepareStatement.executeUpdate();
				System.out.println("��ӳɹ�");
			} catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	//ɾ��һ�ſγ�
	@Override
	public void deleteCourse(int couId) {
		String sql = "DELETE FROM course WHERE couId = ?";
		try(
				PreparedStatement prepareStatement = CONN.prepareStatement(sql);
				) {
			prepareStatement.setInt(1, couId);
			prepareStatement.executeUpdate();
			System.out.println("ɾ���ɹ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//�޸�һ�ſγ�
	@Override
	public void updateCourse(Course c) {
		String sql = "UPDATE course SET couName = ? WHERE couId = ?";
		try(
				PreparedStatement prepareStatement = CONN.prepareStatement(sql);
				) {
			prepareStatement.setString(1, c.getCouName());
			prepareStatement.setInt(2, c.getCouId());
			prepareStatement.executeUpdate();
			System.out.println("�޸ĳɹ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�鿴ѧ���γ�
	public void allCourse() {
		String sql = "SELECT * FROM course";
		try(
				PreparedStatement prepareStatement = CONN.prepareStatement(sql);
				ResultSet rs = prepareStatement.executeQuery();
				) {
			
			while(rs.next()) {
				int int1 = rs.getInt(1);
				String string = rs.getString(2);
				System.out.println(int1+"\t"+string);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
