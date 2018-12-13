package com.sunysrd.Proxy;

public class SellImpl implements Sell{
	String name;
	int price;
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String Sell(String name) {
		// TODO Auto-generated method stub
		System.out.println("买东西了！我买的是"+name);
		return name;
	}
	
}
