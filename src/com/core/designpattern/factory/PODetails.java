package com.core.designpattern.factory;

public class PODetails {
	
	private int poNbr;
	private int itemNbr;
	private String poType;
	
	public int getPoNbr() {
		return poNbr;
	}
	public void setPoNbr(int poNbr) {
		this.poNbr = poNbr;
	}
	public int getItemNbr() {
		return itemNbr;
	}
	public void setItemNbr(int itemNbr) {
		this.itemNbr = itemNbr;
	}
	public String getPoType() {
		return poType;
	}
	public void setPoType(String poType) {
		this.poType = poType;
	}
	@Override
	public String toString() {
		return "PODetails [poNbr=" + poNbr + ", itemNbr=" + itemNbr + ", poType=" + poType + "]";
	}
	
	
}
