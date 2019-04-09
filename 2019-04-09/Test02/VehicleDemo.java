package com.Weian.Test02;

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("法拉利", '红');
		Vehicle v2 = new Vehicle("奥迪", '黑');
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
		System.out.println("一辆"+color+"色的"+brand+"以"+speed+"迈的速度行驶");
	}
}