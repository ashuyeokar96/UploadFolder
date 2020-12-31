package com.cjc.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ForLoop {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap();
		m.put(15, "Hello");
		m.put(10, "Hii");
		m.put(5, "Welcome");
		
		Set<Integer> keys=m.keySet();
		
		for(int key : keys)
		{
			System.out.println(key);
			String val=m.get(key);
			System.out.println(val);
		}
		
	}

}
