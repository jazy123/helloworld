package com.jazy.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.aop.IBuyService;

public class TestHelloService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext-AOP.xml");
		
		IHelloService helloService = context.getBean("helloBean", IHelloService.class);
		
		helloService.sayHello("Lily");	
		
		helloService.sayBye();
		
		/*IHelloService helloService2 = context.getBean("helloBean2", IHelloService.class);
		
		helloService2.sayHello("Han Meimei");	
		
		IHelloService helloService3 = context.getBean("helloBean3", IHelloService.class);
		
		helloService3.sayHello("周国人");	*/
		
		IBuyService buyService = context.getBean("buyBean", IBuyService.class);
		buyService.save();


	}

}
