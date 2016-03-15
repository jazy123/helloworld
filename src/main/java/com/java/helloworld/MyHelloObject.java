package com.java.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyHelloObject extends HelloObject {
	
	public MyHelloObject(){
		this(123);
		System.out.println("Myhelloobject is construactor...");
	}
	
	public MyHelloObject(int i){
		super(i);
		System.out.println("Myhelloobject is construactor with i ...");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloObject.Increase();
		
		MyHelloObject obj1 = new MyHelloObject();
		obj1.Increase();
		
		obj1.sayHello("jason");
		
		String[] sss = new String[]{"111","2222","33333"};
		
		
		ArrayList<String> strList = new ArrayList<String>();
		for(String s : sss){
			System.out.println("s: " + s);
		
			strList.add(s);
		}
		
		Collections.reverse(strList);
		
		strList.forEach( (str)-> System.out.println("str: " + str));
		

	}

}
