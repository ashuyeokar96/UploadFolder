package com.cjc.MapTask;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ListMapMapWorldGenric {
	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> up=new ArrayList<>();
		up.add("Ayoddhya");
		up.add("Agra");
		up.add("Zansi");
		
		Map<String,List<String>> India=new HashMap<>();
		India.put("Maharashtra", mh);
		India.put("Uttr Pradesh", up);
		
		List<String> cal=new ArrayList<>();
		cal.add("Miami");
		cal.add("Cruz");
		
		List<String> fl=new ArrayList<>();
		fl.add("Tampa");
		fl.add("Destin");
		
		Map<String,List<String>> USA=new HashMap<>();
		USA.put("Florida",fl );
		USA.put("California", cal);
		
		Map<String , Map<String , List<String>>> world=new HashMap<>();
		world.put("India",India);
		world.put("USA",USA);
				
		Set<String> keys=world.keySet();
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println("Country - "+key);
			Map<String,List<String>> country=world.get(key);
			
			Set<String> keys1=country.keySet();
			
			Iterator<String> itr1=keys1.iterator();
			while(itr1.hasNext())
			{
				String key1=itr1.next();
				System.out.println("\tState - "+key1);
                List<String> cities=country.get(key1);
                Iterator<String> itr2=cities.iterator();
                while(itr2.hasNext())
                {
                	String city=itr2.next();
                	System.out.println("\tCity - "+city);
                }
			}
			
		}
		
	}

}
