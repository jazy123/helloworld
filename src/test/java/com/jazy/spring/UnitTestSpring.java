package com.jazy.spring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import junit.framework.TestCase;

public class UnitTestSpring extends TestCase {
	
	/**
	 * 默认配置文件名称
	 */
	private static final String DEFAULT_BEANCONTEXT = "ApplicationContext.xml";

	public UnitTestSpring(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testCreateBeanFactory() {
		BeanFactory factory = this.initBeanFactory();		
		Assert.assertTrue(factory != null);		
	}
	
	@Test
	public void testCreateBean(){
		BeanFactory factory = this.initBeanFactory();
		IHello hello = factory.getBean("defaultBean", IHello.class);
		Assert.assertEquals(hello.say("Jack"),"Hi, Jack");		
	}
	
	@Test
	public void testCreateSameBean(){
		BeanFactory factory = this.initBeanFactory();
		IHello src = factory.getBean("helloBean", IHello.class);
		IHello dest = factory.getBean("helloBean", IHello.class);
		Assert.assertEquals(src, dest);
	}
	
	@Test
	public void testCreateAliasBean(){
		BeanFactory factory = this.initBeanFactory();
		IHello hello1 = factory.getBean("defaultBean",IHello.class);
		IHello alias = factory.getBean("myBean", IHello.class);
		Assert.assertEquals(hello1, alias);
	}
	
	private BeanFactory initBeanFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext(DEFAULT_BEANCONTEXT);
//		ResourceLoaderAware bean = context.getBean("defaultBean");
		
		return context;
	}
	
	
	private BeanFactory initBeanFactory2(){
		Resource resource = new ClassPathResource(DEFAULT_BEANCONTEXT);
		return new XmlBeanFactory(resource);
	}

}
