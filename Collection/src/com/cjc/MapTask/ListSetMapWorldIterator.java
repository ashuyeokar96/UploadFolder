package com.cjc.MapTask;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ListSetMapWorldIterator {
	
	public static void main(String[] args) {
		
		List mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List mp=new ArrayList<>();
		mp.add("Bhopal");
		mp.add("Indore");
		
		Set India=new HashSet<>();
		India.add(mh);
		India.add(mp);
		
		List cal=new ArrayList<>();
		cal.add("Los Angeles");
		cal.add("Santa Cruz");
		
		List fl=new ArrayList<>();
		fl.add("Tampa");
		fl.add("Destin");
		
		Set USA=new HashSet<>();
		USA.add(cal);
		USA.add(fl);
		
		Map world=new HashMap<>();
		world.put("India", India);
		world.put("USA", USA);
		
		Set keys=world.keySet();
		
		Iterator itr=keys.iterator();//India USA
		while(itr.hasNext())
		{
			String key=(String) itr.next();
			System.out.println("\n\tkey - "+key);//India  USA
			
			Set country=(Set) world.get(key);//{mh,mp}
			System.out.println(country);
			Iterator itr1=country.iterator();
			while(itr1.hasNext())
			{			   
				
				List state=(List) itr1.next();
				System.out.println(state);
			    Iterator itr2=state.iterator();
				while(itr2.hasNext())
				{
					
			        String city=(String) itr2.next();
			        System.out.println("\tCity - "+city);
			       
				} 
		    }
		
		System.out.println("\n-----------------------------------------------------------------");
	  
		}
		
	}

}
