/**
 * 
 */
package com.ha.demo;

import javax.jws.WebService;

/**
 * @author Abhinandan
 *
 */
@WebService(targetNamespace = "http://demo.ha.com/", endpointInterface = "com.ha.demo.MyWebServiceSEI", portName = "MyWebServicePort", serviceName = "MyWebServiceService")
public class MyWebService implements MyWebServiceSEI {
	public void greeting(String name){
		System.out.println("Hello"+name+"nice to see you here");
	}
}
