package com.Weian.Test;

public class TrafficDemo {
	public static void main(String[] args) {
		Traffic t1 = new Traffic("��������", 200, 10);
		t1.move();
		//����0Ϊ�����ٶ�,С��0�����
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
		System.out.println(name + "��ǰ�ƶ���");
	}

	public void plusSpeed(int x) {
		speed += x;
		if(x>0) {
			System.out.println(name + "�������ٶȣ���ʱ�ٶ�Ϊ:" + speed + "��");
		}else {
			System.out.println(name + "�������ٶȣ���ʱ�ٶ�Ϊ:" + speed + "��");
		}
		

	}



}