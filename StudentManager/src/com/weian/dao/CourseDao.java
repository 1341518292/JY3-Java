package com.weian.dao;

import com.weian.entity.Course;

/**
 * �γ̱�ķ���
 * @author Weian
 *
 */
public interface CourseDao {
	//����һ�ſγ�
	void addCourse(Course c);
	
	//ɾ��һ�ſγ�
	void deleteCourse(int couId);
	
	//�޸�һ�ſγ�
	void updateCourse(Course c);

	//�鿴���пγ�
	void allCourse();
}
