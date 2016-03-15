package com.cnki.edsapi;

import java.util.Map;

import cn.jzy.common.network.http.HttpXmlPostWrapper;

public class EdsTokenWrapper extends HttpXmlPostWrapper {

	public EdsTokenWrapper() {
		System.out.println("EdsTokenWrapper() is executing...");
	}

	public EdsTokenWrapper(String url, String encode) {		
		super(url, encode);
		System.out.println("EdsTokenWrapper(String url, String encode) is executing...");
	}

	@Override
	protected String formatRequestXml(Map<String, String> params, String encode) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<CreateSessionRequestMessage xmlns=\"http://epnet.com/webservices/EbscoApi/Contracts\"");
		buffer.append(" xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\">");
		buffer.append(String.format("<Profile>%s</Profile>", params.getOrDefault("profile", "edsapicnki")));
		buffer.append("<Guest>n</Guest>");
		buffer.append("<Org i:nil=\"true\" />");
		buffer.append("</CreateSessionRequestMessage>");
		return buffer.toString();
	}

}
