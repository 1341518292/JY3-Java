package com.Weian.Test02;

public class NotebookDemo {
	public static void main(String[] args) {
		Notebook notebook = new Notebook('��', "i9-9700");
		notebook.getInformation();
	}
}
class Notebook{
	char color;
	String cpu;
	public Notebook() {
		// TODO Auto-generated constructor stub
	}
	public Notebook(char color, String cpu) {
		this.color = color;
		this.cpu = cpu;
	}
	public void getInformation() {
		System.out.println("�ʼǱ�����ɫΪ:"+color+"cpu�ͺ�Ϊ:"+cpu);
	}
}