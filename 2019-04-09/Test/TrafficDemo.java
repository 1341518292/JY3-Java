package com.Weian.Test;

public class TrafficDemo {
	public static void main(String[] args) {
		Traffic t1 = new Traffic("兰博基尼", 200, 10);
		t1.move();
		//大于0为增加速度,小于0则减少
		t1.plusSpeed(-1);
		
	}

}

class Traffic {
	String name;
	int speed;
	int size;

	@Override
	public String toString() {
		return "Traffic [name=" + name + ", speed=" + speed + ", size=" + size + "]";
	}

	public Traffic() {

	}

	public Traffic(String name, int speed, int size) {
		this.name = name;
		this.size = size;
		this.speed = speed;
	}

	public void move() {
		System.out.println(name + "向前移动了");
	}

	public void plusSpeed(int x) {
		speed += x;
		if(x>0) {
			System.out.println(name + "增加了速度，此时速度为:" + speed + "迈");
		}else {
			System.out.println(name + "减少了速度，此时速度为:" + speed + "迈");
		}
		

	}



}