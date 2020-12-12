package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class SDPTest {

	public static void main(String[] args) {
		Flipkart flipkart = null;
		System.out.println("SDPTest.main()");
		
		//Calling factory method
		flipkart = FlipkartFactory.getInstance();

		//Calling b.method of target class
		String result = flipkart.shopping(new String[] { "laptop,mouse,keyboard" }, new float[] { 50000, 4000, 800 });
		System.out.println(result);
	}

}
