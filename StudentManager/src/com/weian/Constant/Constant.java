package com.weian.Constant;
/**
 * ����
 * @author Weian
 *
 */

import java.sql.Connection;

import com.weian.dao.CourseDaoImpl;
import com.weian.dao.StudentAndCourseDaoImpl;
import com.weian.dao.StudentDaoImpl;
import com.weian.util.DBUtils;

public class Constant {
	//ѧ���γ̹�ϵ��
	public static final StudentAndCourseDaoImpl SAD = new StudentAndCourseDaoImpl();
	//ѧ����
	public static final StudentDaoImpl STU = new StudentDaoImpl();
	//�γ̱�
	public static final CourseDaoImpl COU = new CourseDaoImpl();
	//�������ݿ�
	public static final Connection CONN = DBUtils.getConnection();

	
}
