package com.Weian.Test02;

public class Demo06 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 4);
		System.out.println("面积为:"+r1.getArea()); 
		System.out.println("周长为:"+r1.getPer()); 
		r1.showAll();
	}
	
}

//定义一个矩形类Rectangle
class Rectangle {
	int length; // 长
	int width; // 宽

	public Rectangle() {

	}

	public Rectangle(int x, int y) {
		length = x;
		width = y;
	}
//	getArea()求面积
	public int getArea() {
		return length*width;
	}
// getPer()求周腸長	
	public int getPer() {
		return 2*(length+width);
	}
// 全部都要
	public void showAll() {
		System.out.println("长:"+length+"  宽:"+width+"  面积:"+(length*width)+"  周长:"+2*(length+width));
	}
}