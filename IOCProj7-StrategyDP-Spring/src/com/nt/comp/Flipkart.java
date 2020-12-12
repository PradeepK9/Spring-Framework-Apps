package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

//final --rule3
public final class Flipkart {

	// property----rule1 and 2
	Courier courier = null;

	// rule2
public void setCourier(Courier courier) {
	System.out.println("Flipkart.setCourier()");
	this.courier=courier;
}

	// 0-param constructor
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}

	// B.method
	public String shopping(String[] items, float[] prices) {
		System.out.println("Flipkart.shopping()");

		// Generating order id dynamically as random number
		int oid = new Random().nextInt(1000);

		// Use courier service to deliver the product
		String msg = courier.deliver(oid);

		// Calculate bill amount
		float amt = 0.0f;
		for (float p : prices) {
			amt = amt + p;
		}

		// Retrun bill Amt and courier details to customer
		return Arrays.toString(items) + " items are purchased with prices " + Arrays.toString(prices)
				+ " having bill amount " + amt + " ====> " + msg;
	}
}
