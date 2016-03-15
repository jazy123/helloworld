package com.java.helloworld;

public class HelloObject {
	
	static int index = 0;
	
	public static void Increase(){
		System.out.println("index: " + ++index);
	}
	
	public HelloObject(){
		System.out.println("helloobject is construactor...");
	}
	
	public HelloObject(int i){
		System.out.println("helloobject is construactor with i ...");
	}
	
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void  sayHello(String name){
		System.out.println("HelloObject.sayHello：" +  name  );
	}
	
	

}
