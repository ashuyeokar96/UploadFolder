package com.cjc.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorGenric
{
	
	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<>();
		m.put(5, "Shirin");
		m.put(10, "Kriti");
		m.put(3, "Rushabh");
		m.put(8, "Rithvik");
		
		
		Set<Integer> keys=m.keySet();
		System.out.println(keys);
		
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			String val=m.get(key);
			System.out.println(key+"----"+val);
		}
	}

}
