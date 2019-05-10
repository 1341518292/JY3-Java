package com.weian.Constant;
/**
 * 常量
 * @author Weian
 *
 */

import java.sql.Connection;

import com.weian.dao.CourseDaoImpl;
import com.weian.dao.StudentAndCourseDaoImpl;
import com.weian.dao.StudentDaoImpl;
import com.weian.util.DBUtils;

public class Constant {
	//学生课程关系表
	public static final StudentAndCourseDaoImpl SAD = new StudentAndCourseDaoImpl();
	//学生表
	public static final StudentDaoImpl STU = new StudentDaoImpl();
	//课程表
	public static final CourseDaoImpl COU = new CourseDaoImpl();
	//连接数据库
	public static final Connection CONN = DBUtils.getConnection();

	
}
