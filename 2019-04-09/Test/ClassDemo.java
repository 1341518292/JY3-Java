package com.Weian.Test;

public class ClassDemo {
		public static void main(String[] args) {
			Book book  = new Book();
			book.author="����";
			book.name="�ǳ���";
			book.type="����";
			book.price=150;
			System.out.println("����:"+book.name);
			System.out.println("����:"+book.author);
			System.out.println("����:"+book.type);
			System.out.println("�۸�:"+book.price);
		
			book.lookBook(new Person1().name="����");
			book.sellBook("����");
			System.out.println(book.toString());
		}
}
class Book{
	String name;
	String type;
	String author;
	int price;
	public void lookBook(String name){
		System.out.println(name+"���ڿ���....");
	}
	public void sellBook(String name){
		System.out.println(name+"��������...");
		
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", type=" + type + ", author=" + author + ", price=" + price + "]";
	}
}
class Person1{
	String name;
	int age;
	int height;
	int weight;
}