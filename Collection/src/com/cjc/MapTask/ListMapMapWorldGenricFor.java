package com.cjc.MapTask;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;

public class ListMapMapWorldGenricFor {
	
	public static void main(String[] args) {
		List<String> up=new ArrayList<>();
		up.add("Waransi");
		up.add("Ayodhya");
		
		List<String> mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Nagpur");
		
		Map<Integer,List<String>> India=new HashMap<>();
		India.put(1, mh);
		India.put(2,up);
		
		List<String> cal=new ArrayList<>();
		cal.add("Cruz");
		cal.add("Berlin");
		
		List<String> fl=new ArrayList<>();
		fl.add("Tampa");
		fl.add("Destin");
		
		Map<Integer , List<String>> USA=new HashMap<>();
		USA.put(1, cal);
		USA.put(2, fl);
		
		Map<String,Map<Integer,List<String>>> world=new HashMap<>();
		world.put("India", India);
		world.put("USA", USA);
		
		Set<String> keys=world.keySet();
		for(String key : keys)
		{
			System.out.println("\tCountry - "+key);//India------------------------ USA(Keys)
			
			Map<Integer,List<String>> country=world.get(key);//India ----------------------------- USA(Value)
			Set<Integer> state=country.keySet();//India-----------1 2                 USA---------1 2
			for(Integer x : state)
			{
				int y=x;//1---India------
				System.out.println("\tState - "+y);//1
				List<String> cities=country.get(y);//mh
				for(String city : cities)
				{
					//System.out.println(cities);//[Pune,Nagpur]
					String c=city;
					System.out.println("\tCity - "+c);//Pune Nagpur
				}
				System.out.println("--------------------------------------------------------------------------------------");
			}
			System.out.println("=======================================================================================");
		}
//		Iterator<String> itr=keys.iterator();
//		while(itr.hasNext())
//		{
//			String key=itr.next();
//			System.out.println("\tCountry - "+key);
//			
//			Map<Integer,List<String>> state=world.get(key);
//			
//			Set<Integer> keys1=state.keySet();
//			Iterator<Integer> itr1=keys1.iterator();
//			while(itr1.hasNext())
//			{
//				int key1=itr1.next();
//				System.out.println("\tState - "+key1);
//				
//				List<String> cities=state.get(key1);
//				Iterator<String> itr2=cities.iterator();
//				while(itr2.hasNext())
//				{
//					String city=itr2.next();
//					System.out.println("\tCity - "+city);
//				}
//				System.out.println("\t----------------------------------------------------------------");
//			}
//			System.out.println("\n\t==========================================================");
//		}
		
		
		
	}

}
