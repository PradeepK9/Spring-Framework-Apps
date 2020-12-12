package com.nt.comp;

//final -rule3
//Interface impl - rule2
public final class BlueDart implements Courier{

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.delever()");
		return "BlueDart Courier will deliver order id "+oid+" order products";
	}
	
}
