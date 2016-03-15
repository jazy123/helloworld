package com.cnki.edsapi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

public class EdsAuthWrapperTest {
	
	public EdsAuthWrapperTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {
		EdsAuthWrapper instance = new EdsAuthWrapper();
		instance.setUrl("https://adn-eds-api.ebscohost.com/authservice/rest/UIDAuth");
		instance.setEncode("UTF-8");
		
		Map<String,String> params = new HashMap<String,String>();
		params.put("userid", "ebscocnki");
		params.put("password", "@@cnki@@");		
		instance.setParams(params);
		
		String message = null;		
		try {
			instance.forward();			
			message = instance.getText().toString();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		Assert.notNull(message);
	}
}
