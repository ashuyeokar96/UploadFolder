package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class OneGenricIterator {
	
	public static void main(String[] args) {
		
		Map<String , String> m=new HashMap<>();
		m.put("aa", "abc");
		m.put("bb", "pqr");
		m.put("cc", "xyz");
		
		Set<String> keys=m.keySet();
		
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println("Key : "+key);
			String val=m.get(key);
			System.out.println("value : "+val);
			System.out.println("-------------------------------------------------------------------------------");
		}
	}

}
