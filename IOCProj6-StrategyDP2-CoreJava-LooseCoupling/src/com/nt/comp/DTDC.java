package com.nt.comp;

//final -rule3
//Interface impl - rule2
public final class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.delever()");
		return "DTDC courier will deliver order id "+oid+"oder products";
	}

}
