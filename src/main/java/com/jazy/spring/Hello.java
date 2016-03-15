package com.jazy.spring;

public class Hello implements IHello {

	@Override
	public String say(String name) {
		String message = "Hi, " + name ;
		System.out.println(message);
		return message;
	}

}
