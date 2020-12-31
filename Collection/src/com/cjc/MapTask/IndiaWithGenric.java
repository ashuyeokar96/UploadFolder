package com.cjc.MapTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IndiaWithGenric {
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
		
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			 String key=itr.next();
			 
			 System.out.println("\tState - "+key);
			 
			 List<String> state=India.get(key);
			 
			 Iterator<String> itr1=state.iterator();
			 while(itr1.hasNext())
			 {
				 String city=itr1.next();
				 System.out.println("\tCity - "+city);
				 
			 }
			System.out.println("----------------------------------------------------------"); 
		}
		
	}

}
