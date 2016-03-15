/**
 * 
 */
package com.cnki.edsapi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import cn.jzy.common.network.http.HttpXmlPostWrapper;

/**
 * @author jiangzy
 *
 */
public class EdsAuthWrapper extends HttpXmlPostWrapper {

	/**
	 * 
	 */
	public EdsAuthWrapper() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected String formatRequestXml(Map<String, String> params, String encode) {		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<UIDAuthRequestMessage xmlns=\"http://www.ebscohost.com/services/public/AuthService/Response/2012/06/01\"");
		buffer.append(" xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\">");
		buffer.append(String.format("<UserId>%s</UserId>", params.getOrDefault("userid", "ebscocnki")));
		buffer.append(String.format("<Password>%s</Password>", params.getOrDefault("password", "@@cnki@@")));
		buffer.append("<InterfaceId>edsapi_console</InterfaceId>");
		buffer.append("</UIDAuthRequestMessage>");
		return buffer.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdsAuthWrapper instance = new EdsAuthWrapper();
		instance.setUrl("https://adn-eds-api.ebscohost.com/authservice/rest/UIDAuth");
		instance.setEncode("UTF-8");
		
		Map<String,String> params = new HashMap<String,String>();
		params.put("userid", "ebscocnki");
		params.put("password", "@@cnki@@");
		
		instance.setParams(params);
		
		try {
			instance.forward();
			
			String message = instance.getText().toString();
			System.out.println("data:" + message);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("finished.");
		
		
		

	}

	

}
