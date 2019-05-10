package com.weian.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.weian.entity.Course;
import com.weian.util.DBUtils;

/**
 * 课程接口的实现类
 * @author Weian
 *
 */
public class CourseDaoImpl implements CourseDao{
	
	private static final Connection CONN = DBUtils.getConnection();
	
	//添加一门课程
	@Override
	public void addCourse(Course c) {
		String sql = "INSERT INTO course VALUES(?,?)";
			try(
				
				PreparedStatement prepareStatement = CONN.prepareStatement(sql);

					) {
				prepareStatement.setInt(1, c.getCouId());
				prepareStatement.setString(2, c.getCouName());
				prepareStatement.executeUpdate();
				System.out.println("添加成功");
			} catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	//删除一门课程
	@Override
	public void deleteCourse(int couId) {
		String sql = "DELETE FROM course WHERE couId = ?";
		try(
				PreparedStatement prepareStatement = CONN.prepareStatement(sql);
				) {
			prepareStatement.setInt(1, couId);
			prepareStatement.executeUpdate();
			System.out.println("删除成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//修改一门课程
	@Override
	public void updateCourse(Course c) {
		String sql = "UPDATE course SET couName = ? WHERE couId = ?";
		try(
				PreparedStatement prepareStatement = CONN.prepareStatement(sql);
				) {
			prepareStatement.setString(1, c.getCouName());
			prepareStatement.setInt(2, c.getCouId());
			prepareStatement.executeUpdate();
			System.out.println("修改成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//查看学生课程
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
