package com.weian.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.weian.util.DBUtils;

public class StudentAndCourseDaoImpl implements StudentAndCourseDao{

	private static final Connection CONN = DBUtils.getConnection();

	
	//添加
	@Override
	public void addStuCourse(String stuId, int cId) {
		String sql = "INSERT INTO stuandcourse(sId,cId) VALUES(?,?)";
		try(
				PreparedStatement prepareStatement = CONN.prepareStatement(sql);
				) {
			prepareStatement.setString(1, stuId);
			prepareStatement.setInt(2, cId);
			prepareStatement.executeUpdate();
			System.out.println("添加成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//删除
	@Override
	public void deleteStuCourse(String stuId, int cId) {
		String sql = "DELETE FROM stuandcourse WHERE sId = ? AND cId = ?";
		try(
				PreparedStatement prepareStatement = CONN.prepareStatement(sql);
				) {
			prepareStatement.setString(1, stuId);
			prepareStatement.setInt(2, cId);
			prepareStatement.executeUpdate();
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
