package com.cjc.MapTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IndiaForEach {
	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<>();
		mh.add("Amravati");
		mh.add("Aurangabad");
		mh.add("Yavtmal");
		
		List<String> jh=new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Ludhiyana");
		
		Map<String , List<String>> India=new HashMap<>();
		India.put("Maharashtra", mh);
		India.put("Jharkhand", jh);
		
		Set<String> keys=India.keySet();
		
		for(String key : keys)
		{
			//String state=key;
			System.out.println("\tState - "+key);
			
			List<String> state=India.get(key);
			
			for(String city : state)
			{
				System.out.println("\tCity - "+city);
			}
			System.out.println("--------------------------------");
		}
		
	}

}
