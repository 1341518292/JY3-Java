package com.Weian.Test02;

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("������", '��');
		Vehicle v2 = new Vehicle("�µ�", '��');
		v1.setBrand(30.0);
		v1.run();
		v2.run();
		
	}
}
 class Vehicle{
	 String brand;
	 char color;
	private double speed;
	public Vehicle() {
		speed = 0;
	}
	public Vehicle(String brand,char color) {
		speed =0;
		this.brand=brand;
		this.color=color;
	}
	public void setBrand(double speed) {
		this.speed= speed;
	}
	public void run() {
		System.out.println("һ��"+color+"ɫ��"+brand+"��"+speed+"�����ٶ���ʻ");
	}
}