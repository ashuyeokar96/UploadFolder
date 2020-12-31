package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoWithGenricFor {
	
public static void main(String[] args) {
		
		Map<Double , String> m=new HashMap<>();
		m.put(1d, "abc");
		m.put(2d, "pqr");
		m.put(3d, "xyz");
		
		Set<Double> keys=m.keySet();
		
		for(double key : keys)
		{
			System.out.println("\tkey - "+key);
			String val=m.get(key);
			System.out.println("\tvalue - "+val);
			System.out.println("................................................................................");
		}
   }

}
