package com.weian.dao;
/**
 * ��ϵ��ķ���
 * @author Weian
 *
 */
public interface StudentAndCourseDao {

	//���ѡ���ſγ̵�ѧ��
	void addStuCourse(String stuId,int cId);
	
	//ɾ��ѡ���ſγ̵�ѧ��
	void deleteStuCourse(String stuId,int cId);
}
