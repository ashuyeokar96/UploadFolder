package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoWithoutGenricIterator {
	public static void main(String[] args) {
		Map m=new HashMap<>();
		m.put(1d, "abc");
		m.put(2d, "pqr");
		m.put(3d, "xyz");
		
		Set keys=m.keySet();
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			double key=(double) itr.next();
			System.out.println("\tKey - "+key);
			String val=(String)m.get(key);
			System.out.println("\tValue - "+val);
			System.out.println("......................................................................");
		}
	}

}
