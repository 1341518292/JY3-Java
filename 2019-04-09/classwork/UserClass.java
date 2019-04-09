package com.Weian.classwork;

public class UserClass {
	String [] username;
	String [] password;
	public UserClass() {
		username= new String[] { "hello"};
		password= new String[] { "123456"};
	}
	public boolean checkUser(String username,String password) {
		boolean a1 = false;
		boolean a2 = false;
		for(int i=0;i<this.username.length;i++) {
			if(this.username[i].equals(username)) {
				a1 =true;
			}
		}
		for(int i=0;i<this.password.length;i++) {
			if(this.password[i].equals(password)) {
				a2 =true;
			}
		}
			if(a1 && a2) 
			{
				return true;	
			}
		return false;	
	}
}
