package com.Weian.Test;

public class ClassDemo {
		public static void main(String[] args) {
			Book book  = new Book();
			book.author="辰东";
			book.name="星辰变";
			book.type="玄幻";
			book.price=150;
			System.out.println("书名:"+book.name);
			System.out.println("作者:"+book.author);
			System.out.println("类型:"+book.type);
			System.out.println("价格:"+book.price);
		
			book.lookBook(new Person1().name="马云");
			book.sellBook("马化腾");
			System.out.println(book.toString());
		}
}
class Book{
	String name;
	String type;
	String author;
	int price;
	public void lookBook(String name){
		System.out.println(name+"正在看书....");
	}
	public void sellBook(String name){
		System.out.println(name+"还在卖书...");
		
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