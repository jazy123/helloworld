package com.java.helloworld;

public class MyStatic {
	
	static int i;
	
	static{
		System.out.println("MyStatic->static");
		System.out.println("i: " + ++i);
	}
	
	static MyStatic Obj1 = new MyStatic();
	static MyStatic obj2 = new MyStatic();
	
	public void read(){
		System.out.println("MyStatic object -> read();");
	}

	public static void main(String[] args) {
		
		MyStatic obj1 = new MyStatic();
		MyStatic obj2 = new MyStatic();
		
		obj1.read();
		obj2.read();
		
		char[] item = {'2','3','4','5','6',' '};

	}

}
