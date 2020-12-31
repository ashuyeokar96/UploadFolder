package com.cjc.MapTask;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class ListSetMapWorldFor {
	public static void main(String[] args) {
		List<String> mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> mp=new ArrayList<>();
		mp.add("Bhopal");
		mp.add("Indor");
		
		List<String> cal=new ArrayList<>();
		cal.add("Los Angles");
		cal.add("Santa Cruz");
		
		List<String> fl=new ArrayList<>();
		fl.add("Tampa");
		fl.add("Destin");
		
		Set<List<String>> India=new HashSet<>();
		India.add(mh);
	    India.add(mp)	;
	    
	    Set<List<String>> USA=new HashSet<>();
	    USA.add(cal);
	    USA.add(fl);
	    
	    Map<Integer , Set<List<String>>> world=new HashMap<>();
	    world.put(1, India);
	    world.put(2, USA);
	    
	    
	    Set<Integer> keys=world.keySet();
	    
	    for(Integer key : keys)
	    {
	    	System.out.println("\n\tKey - "+key);
	    	Set<List<String>> country=world.get(key);
	    	
	    	
	    	for(List<String> state : country)
	    	{
	    		List<String> city=state;
	    		
	    		for(String c : city)
	    		{
	    			System.out.println("\n\tCity - "+c);
	    		}
	    		
	    	}
	    }
	}

}
