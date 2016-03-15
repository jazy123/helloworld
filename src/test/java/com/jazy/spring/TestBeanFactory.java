package com.jazy.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBeanFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Resource resource = new ClassPathResource("ApplicationContext.xml");	
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		BeanFactory factory2 = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("factory == factory2 : " + (factory == factory2));
		
		IHello defaultBean = (IHello)factory.getBean("defaultBean");
		System.out.println("(IHello)factory.getBean('defaultBean'):" + defaultBean);
		
		IHello helloBean = factory.getBean("helloBean", IHello.class);
		System.out.println("(IHello)factory.getBean('helloBean'):" + helloBean);
		
		IHello helloBean2 = factory.getBean("helloBean", IHello.class);
		System.out.println("(IHello)factory.getBean('helloBean'):" + helloBean2);
		
		System.out.println("helloBean == helloBean2 : " + (helloBean == helloBean2));
		
		System.out.println("helloBean equal helloBean2 : " + helloBean.equals(helloBean2));
		
	
		/*IHello typeBean = (IHello)factory.getBean(IHello.class);
		System.out.println("(IHello)factory.getBean(IHello.class):" + typeBean);*/
		
		
		
	}

}
