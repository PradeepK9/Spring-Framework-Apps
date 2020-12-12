package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FirstFlight;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props = null;

	static {
		System.out.println("FlipkartFactory== static block");
		try {
			// Locate the properties file using stream
			InputStream is = new FileInputStream("src/com/nt/commons/info.properties");
			// Create the Properties class obj
			props = new Properties();
			// Loading the file data to Properties obj
			props.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Flipkart getInstance() {
		Flipkart flipkart = null;
		Courier courier = null;

		// Creating Dependent class obj
		/*if(cType.equalsIgnoreCase("blueDart")) {
			courier=new BlueDart();
		}
		else if(cType.equalsIgnoreCase("DTDC")) {
			courier=new DTDC();
		}
		else if(cType.equalsIgnoreCase("firstFlight")) {
			courier=new FirstFlight();
		}
		else {
			throw new IllegalArgumentException("Invalid Courier Name");
		}*/

		try {
			Class c1 = Class.forName(props.getProperty("sdp.denendent_class"));
			courier = (Courier) c1.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		// Creating Target class obj
		flipkart = new Flipkart();

		// Assignment dependent class obj to target class obj
		flipkart.setCourier(courier);

		return flipkart;
	}

}
