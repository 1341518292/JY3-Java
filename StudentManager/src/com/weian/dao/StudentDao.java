package com.weian.dao;
/**
 * ѧ����ķ���
 * @author Weian
 *
 */

import java.util.List;

import com.weian.entity.Student;

public interface StudentDao {
	
	//���һ��ѧ����Ϣ
	void addStu(Student student);
	
	//ɾ��һ��ѧ����Ϣ
	void deleteStu(String id);
	
	//�޸�ѧ����Ϣ
	void updateStu(Student student);
	
	//��ѯһ��ѧ����Ϣ
	Student OneStu(String id);
	
	//��ѯȫ��ѧ����Ϣ
	List<Student> AllStu();

	//ͨ��ѧ����������ѧ��ѡ�����
	List<String> getCourse(String Stuid);
	
	//ͨ���γ̺ţ�����ѧ����Ϣ
	List<Student> getStu(int Couid);
	
	
}
