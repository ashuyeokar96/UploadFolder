package com.cjc.MapTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IndiaSetWithoutGenric {
	
	public static void main(String[] args) {
		
		Set mh=new HashSet<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		Set jh=new HashSet<>();
		jh.add("Ranchi");
		jh.add("Lohardaga");
		
		Map India=new HashMap<>();
		India.put(1, mh);
		India.put(2,jh);
		
		Set keys=India.keySet();
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=(int)itr.next();
			System.out.println("\tSate - "+key);
			
			Set<String> state=(Set<String>)India.get(key);
			
			Iterator itr1=state.iterator();
			
			while(itr1.hasNext())
			{
				String city=(String)itr1.next();
				System.out.println("\tcity - "+city);
			}
			System.out.println("-----------------------------------");
		}
		
	}
	

}
