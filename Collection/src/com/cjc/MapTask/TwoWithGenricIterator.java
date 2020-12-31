package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoWithGenricIterator {
	public static void main(String[] args) {
		
		Map<Double , String> m=new HashMap<>();
		m.put(1d, "abc");
		m.put(2d, "pqr");
		m.put(3d, "xyz");
		
		Set<Double> keys=m.keySet();
		
		Iterator<Double> itr=keys.iterator();
		while(itr.hasNext())
		{
			double key=itr.next();
			System.out.println("\tKey - "+key);
			String val=m.get(key);
			System.out.println("\tValue - "+val);
			System.out.println(".......................................................................");
		}
		
	}

}
