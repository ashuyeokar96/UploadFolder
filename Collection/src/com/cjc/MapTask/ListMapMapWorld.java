package com.cjc.MapTask;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ListMapMapWorld {
	public static void main(String[] args) {
		
		List mh=new ArrayList<>();
		mh.add("Akola");
		mh.add("Kolhapur");
		
		List tl=new ArrayList<>();
		tl.add("Hydrabad");
		tl.add("Nirmal");
		
		Map India=new HashMap<>();
		India.put("Maharashtra", mh);
		India.put("Telangana",tl);
		
		List fl=new ArrayList<>();
		fl.add("Tampa");
		fl.add("Cruz");
		
		List cal=new ArrayList<>();
		cal.add("Miami");
		cal.add("Los Angles");
		
		Map USA=new HashMap<>();
		USA.put("California",cal );
		USA.put("Florida", fl);
		
		Map world=new HashMap<>();
		world.put("India", India);
		world.put("USA", USA);
		
		
		Set keys=world.keySet();
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=(String)itr.next();
			System.out.println("\tCountry - "+key); // India  USA
			Map country=(Map) world.get(key);
			
			Set keys1=country.keySet(); 
			Iterator itr1=keys1.iterator();
			while(itr1.hasNext())
			{
				String key1=(String) itr1.next();//Maha
				System.out.println("\n\tState - "+key1);
				
				List cities=(List) country.get(key1);
				Iterator itr2=cities.iterator();
				while(itr2.hasNext())
				{
					String city=(String) itr2.next();
					System.out.println("\n\tCity - "+city);
				}
				System.out.println("----------------------------------------------");
			}
			System.out.println("============================================================================================================");
		}
		
		
	}

}
