package com.sunysrd.Proxy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<String,Object> hashMap=new HashMap<String,Object>();
		hashMap.put("��һ", "��һ����ֵ");
		hashMap.put("�ڶ�", "�ڶ�����ֵ");
		hashMap.put("����", "��������ֵ");
		hashMap.put("����", "���ĸ���ֵ");
		hashMap.put("����", "�������ֵ");
		Iterator it=hashMap.keySet().iterator();
		while(it.hasNext()) {
			String key=(String) it.next();
			String value=(String) hashMap.get(key);
			System.out.println("key��"+key+",value="+value);
		}
		
		Iterator it2=hashMap.entrySet().iterator();	
		while(it2.hasNext()) {
			Entry<String, String> entry=(Entry<String, String>)it2.next();
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		Set<Entry<String,Object>> set=hashMap.entrySet();
		for (Entry<String, Object> entry : set) {
			System.out.println(entry.getKey()+entry.getValue());
		}
	}
}
