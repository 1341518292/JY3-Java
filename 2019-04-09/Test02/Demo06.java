package com.Weian.Test02;

public class Demo06 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 4);
		System.out.println("���Ϊ:"+r1.getArea()); 
		System.out.println("�ܳ�Ϊ:"+r1.getPer()); 
		r1.showAll();
	}
	
}

//����һ��������Rectangle
class Rectangle {
	int length; // ��
	int width; // ��

	public Rectangle() {

	}

	public Rectangle(int x, int y) {
		length = x;
		width = y;
	}
//	getArea()�����
	public int getArea() {
		return length*width;
	}
// getPer()�����c�L	
	public int getPer() {
		return 2*(length+width);
	}
// ȫ����Ҫ
	public void showAll() {
		System.out.println("��:"+length+"  ��:"+width+"  ���:"+(length*width)+"  �ܳ�:"+2*(length+width));
	}
}