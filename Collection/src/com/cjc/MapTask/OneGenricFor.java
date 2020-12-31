package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OneGenricFor {
	public static void main(String[] args) {
		
		Map<String , String> m=new HashMap<>();
		m.put("aa", "abc");
		m.put("bb", "pqr");
		m.put("cc", "xyz");
		
		
		Set<String> keys=m.keySet();
		for(String key : keys)
		{
			System.out.println("Key  : "+key);
			String val=m.get(key);
			System.out.println("Value : "+val);
			System.out.println("\n.....................................................................\n");
		}
		
	}

}
