package com.cjc.MapTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IndiaSetGenricFor {
	
	public static void main(String[] args) {
		
		Set<String> mh=new HashSet<>();
		mh.add("Akola");
		mh.add("Amravati");
		
		Set<String> jh=new HashSet<>();
		jh.add("Ranchi");
		jh.add("Ludhiyana");
		
		Map<String , Set<String>> India=new HashMap<>();
		India.put("MH",mh);
		India.put("JH",jh);
		
		Set<String> keys=India.keySet(); 
		
		for(String key : keys)
		{
			System.out.println("\tstate - "+key);
			Set<String> state=India.get(key);
			
			for(String city : state)
			{
				System.out.println("\tcity - "+city);
			}
		}
	}

}
