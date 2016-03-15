package com.cnki.edsapi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

public class EdsTokenWrapperTest {

	public EdsTokenWrapperTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		EdsTokenWrapper instance = new EdsTokenWrapper();
		instance.setUrl("https://adn-eds-api.ebscohost.com/edsapi/rest/CreateSession");
		instance.setEncode("UTF-8");
		
		Map<String,String> headers = new HashMap<String,String>();
		headers.put("x-authenticationToken", 
				"ABb9c8No_VR4_Ohg6aoIIOqHZFhLIlbhG9p7IkN1c3RvbWVySWQiOiJxaXpoIiwiR3JvdXBJZCI6Im1haW4ifQ");
		instance.setHeaders(headers);
		
		Map<String,String> params = new HashMap<String,String>();
		params.put("profile", "edsapicnki");
		instance.setParams(params);
		
		String message = null;		
		try {
			instance.forward();			
			message = instance.getText().toString();
			System.out.println(message);
		} catch (IOException e) {
			e.printStackTrace();
		}		
		Assert.notNull(message);
	}

}
