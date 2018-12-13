package com.sunysrd.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SellProxy implements InvocationHandler {
	private SellImpl sellImpl;

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		DaZhe(sellImpl.getName(),sellImpl.getPrice());
		method.invoke(sellImpl, args);
		Thanks(sellImpl.getName());
		return null;
	}
	public SellProxy() {
		super();
	}
	public SellProxy(SellImpl sellImpl) {
		super();
		this.sellImpl = sellImpl;
	}
	public SellImpl getSellImpl() {
		return sellImpl;
	}
	public void setSellImpl(SellImpl sellImpl) {
		this.sellImpl = sellImpl;
	}
	public String DaZhe(String name,int price) {
		System.out.println("我要对"+name+"进行打折"+"打折后价格为"+price*0.8);
		return name;
	}
	
	public String Thanks(String name) {
		System.out.println("谢谢你购买"+name);
		return name;
	}
	
	

}
