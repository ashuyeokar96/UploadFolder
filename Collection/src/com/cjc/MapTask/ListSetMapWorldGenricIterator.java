package com.cjc.MapTask;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ListSetMapWorldGenricIterator {
	
	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> mp=new ArrayList<>();
		mp.add("Bhopal");
		mp.add("Indor");
		
		Set<List<String>> India=new HashSet<>();
		India.add(mh);
		India.add(mp);
		
		List<String> cal=new ArrayList<>();
		cal.add("Los Angeles");
		cal.add("Santa Cruz");
		
		List<String> fl=new ArrayList<>();
		fl.add("Tampa");
		fl.add("Destin");
		
		Set<List<String>> USA=new HashSet<>();
		USA.add(cal);
		USA.add(fl);
		
		Map<Integer , Set<List<String>>> world=new HashMap<>();
		world.put(1, India);
		world.put(2, USA);
		
		Set<Integer> keys=world.keySet();
		
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println("\n\t"+key);
			Set<List<String>> country=world.get(key);
			
			Iterator<List<String>> itr1=country.iterator();
			while(itr1.hasNext())
			{
				List<String> state=itr1.next();
				
				Iterator<String> itr2=state.iterator();
				while(itr2.hasNext())
				{
					String city=itr2.next();
					System.out.println("\tCity - "+city);
				}
				System.out.println("\n--------------------------------------------------------------");
			}
			System.out.println("\n=====================================================================");
		}
		
		
		
	}

}
