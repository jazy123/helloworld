package com.abc.aop;

public class BuyService implements IBuyService {

	@Override
	public void save() {
		System.out.println("----------------------");
		System.out.println("hello, i will buy somthing");
	}

}
