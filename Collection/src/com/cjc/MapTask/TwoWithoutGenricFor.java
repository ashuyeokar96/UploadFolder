package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoWithoutGenricFor {
	//without genric we cannot use for each loop
	public static void main(String[] args) {
		Map<Double,String> m=new HashMap<>();
		m.put(1d, "abc");
		m.put(2d, "pqr");
		m.put(3d, "xyz");
		
		Set<Double> keys=m.keySet();
		
		for(double key : keys)
		{
			System.out.println("\tKey - "+key);
			String val=(String) m.get(key);
			System.out.println("\tValue - "+val);
		}
	}

}
