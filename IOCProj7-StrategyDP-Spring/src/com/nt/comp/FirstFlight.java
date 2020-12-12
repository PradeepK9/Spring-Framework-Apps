package com.nt.comp;

//final -rule3
//Interface impl - rule2
public final class FirstFlight implements Courier {
	public FirstFlight() {
		System.out.println("FirstFlight.FirstFlight()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.deliver()");
		return "FirstFlight courier will deliver order id " + oid + " order products";
	}

}
