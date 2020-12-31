package com.cjc.MapTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IndiaSetGenricIterator {
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
		
		Set<String> keys=India.keySet(); //MH   JH
		
		Iterator<String> itr=keys.iterator();//MH JH
		
		while(itr.hasNext())                          
		{
			String key=itr.next();       //JH 
			
			System.out.println("\tState - "+key); //JH   MH
			
			Set<String> state=India.get(key);
			
			
			
			Iterator<String> itr1=state.iterator();
			
			while(itr1.hasNext())
			{
				String city=itr1.next();
				System.out.println("\tCity - "+city);
			}
			
			System.out.println("------------------------");
		}
		
				
	}

}
