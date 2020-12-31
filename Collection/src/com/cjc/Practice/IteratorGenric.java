package com.cjc.Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorGenric {
	public static void main(String[] args) {
		Map<String , String> m=new HashMap<>();
		m.put("A", "Badminton");
		m.put("B","Hocky");
		m.put("C","Cricket");
		m.put("D", "HollyBall");
		
		Set<String> keys=m.keySet();
		
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println("Key : "+key);
			String game=m.get(key);
			System.out.println(game);
		}
	}

}
