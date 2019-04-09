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
		// 求圆的面积
		return Math.pow(r, 2) * Math.PI;
	}

	public boolean contain(Point p1) {
		// 判断两点之间的距离
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
		// 圆心
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(15, p1);
		// 指定的点
		Point p2 = new Point(10, 6);

		// 圆的面积
		System.out.println("圆的面积为:" + c1.Area());
		System.out.println(c1.contain(p2) ? "包含" : "不包含");
		System.out.println(c1.contain(15, 6) ? "包含" : "不包含");
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