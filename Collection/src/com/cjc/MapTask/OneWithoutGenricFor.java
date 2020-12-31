package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OneWithoutGenricFor {
	public static void main(String[] args) {
		
		Map m=new HashMap<>();
		m.put("aa","abc");
		m.put("bb", "pqr");
		m.put("cc","xyz");
		
		Set keys=m.keySet();
		
		for(Object key : keys)
		{
			System.out.println("\tKey - "+key);
			String val=(String) m.get(key);
			System.out.println("\tvalue - "+val);
			System.out.println("..................................................");
		}
		
		
	}

}
