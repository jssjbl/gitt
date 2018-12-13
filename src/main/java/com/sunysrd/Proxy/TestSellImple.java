package com.sunysrd.Proxy;

import java.lang.reflect.Proxy;

public class TestSellImple {
	public static void main(String[] args) {
		SellImpl s=new SellImpl();
		SellProxy sp=new SellProxy(s);
		s.setName("ÎÚºÏÖ®ÖÚ");
		s.setPrice(100);
		Sell sproxy=(Sell) Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), sp);
		sproxy.Sell(s.getName());
	}
}
