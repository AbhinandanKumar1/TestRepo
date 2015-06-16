package com.ha.demo;

import javax.jws.WebService;

@WebService(name = "MyWebServiceSEI", targetNamespace = "http://demo.ha.com/")
public interface MyWebServiceSEI {

	public abstract void greeting(String name);

}