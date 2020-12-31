package com.cjc.MapTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IndiaWithoutGenric {
	public static void main(String[] args) {
		
		List mh=new ArrayList<>();
		mh.add("Amravati");
		mh.add("Aurangabad");
		mh.add("Yavtmal");
		
		List jh=new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Ludhiyana");
		
		Map India=new HashMap<>();
		India.put("Maharashtra", mh);
		India.put("Jharkhand", jh);
		
		Set keys=India.keySet();
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=(String)itr.next();
			System.out.println("\tState - "+key);
			
			List list=(List)India.get(key);
			
			Iterator itr1=list.iterator();
			while(itr1.hasNext())
			{	
				String city=(String)itr1.next();
			   System.out.println("\tCity - "+city);
			} 
		   System.out.println("-----------------------------------------");
		}
		
	}

}
