/**
 * 
 */
package com.cnki.edsapi;

import java.util.Map;

import cn.jzy.common.network.http.HttpXmlPostWrapper;

/**
 * @author jiangzy
 *
 */
public class EdsServiceWrapper extends HttpXmlPostWrapper {

	/**
	 * 
	 */
	public EdsServiceWrapper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param url
	 * @param encode
	 */
	public EdsServiceWrapper(String url, String encode) {
		super(url, encode);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cn.jzy.common.network.http.HttpXmlPostWrapper#formatRequestXml(java.util.Map, java.lang.String)
	 */
	@Override
	protected String formatRequestXml(Map<String, String> params, String encode) {
		// TODO Auto-generated method stub
		return null;
	}

}
