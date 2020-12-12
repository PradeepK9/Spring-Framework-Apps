package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;

public class SDPTest {

	public static void main(String[] args) {
		BeanFactory factory = null;
		Resource res = null;
		Flipkart fpkt = null;
		
		// Hold spring bean cfg file
		res = new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		// create IOC container
		factory = new XmlBeanFactory(res);
		// get Target Bean object
		fpkt = factory.getBean("fpkt", Flipkart.class);
		// invoke the methods
		System.out.println(
				fpkt.shopping(new String[] { "PPEKit", " MASK", "Sanitizer" }, new float[] { 2000, 500, 200 }));
	}// main
}// class
