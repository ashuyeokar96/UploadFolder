package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OneWithoutGenricIterator {
	public static void main(String[] args) {
		Map m=new HashMap<>();
		m.put("aa", "abc");
		m.put("bb", "pqr");
		m.put("cc", "xyz");
		
		Set keys=m.keySet();
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=(String) itr.next();
			System.out.println("\tkey - "+key);
			String val=(String) m.get(key);
			System.out.println("\tValue - "+val);
			System.out.println("............................................................................");
					
		}
		
		
		
	}

}
