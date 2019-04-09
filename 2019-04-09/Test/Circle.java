package com.Weian.Test;

public class Circle {
	int r;
	Point p;

	public Circle() {

		r = 5;
	}

	public Circle(int r, Point p) {
		this.r = r;
		this.p = p;
	}

	public double Area() {
		// ��Բ�����
		return Math.pow(r, 2) * Math.PI;
	}

	public boolean contain(Point p1) {
		// �ж�����֮��ľ���
		new Point();
		if (Math.pow(p.x - p1.x, 2) + Math.pow(p.y - p1.y, 2) <= r * r) {
			return true;
		}
		return false;
	}

	public boolean contain(int x, int y) {

		if (Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) <= r * r) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// Բ��
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(15, p1);
		// ָ���ĵ�
		Point p2 = new Point(10, 6);

		// Բ�����
		System.out.println("Բ�����Ϊ:" + c1.Area());
		System.out.println(c1.contain(p2) ? "����" : "������");
		System.out.println(c1.contain(15, 6) ? "����" : "������");
	}
}

class Point {
	int x;
	int y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}