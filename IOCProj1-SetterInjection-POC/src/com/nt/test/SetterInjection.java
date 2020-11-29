package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
		Resource res = null;
		BeanFactory factory = null;
		Object obj = null;
		WishMessageGenerator generator = null;
		String result = null;

		// Hold name and location of spring bean cfg file
		res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");

		// create Bean Factory IOC container
		factory = new XmlBeanFactory(res);

		// get target bean class cfg obj
		obj = factory.getBean("wmg");

		// Typecasting
		generator = (WishMessageGenerator) obj;

		// invoke the method
		result = generator.generatorWishMessage("Babu");
		System.out.println("Message ===>> " + result);

	}

}
