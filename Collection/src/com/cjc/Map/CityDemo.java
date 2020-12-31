package com.cjc.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CityDemo {
	public static void main(String[] args) {
		
	
	    List<String> mh=new ArrayList<>();
	    mh.add("Nagpur");
	    mh.add("Pune");
	    mh.add("Mumbai");
	    
	    List<String> jh=new ArrayList<>();
	    jh.add("Ranchi");
	    jh.add("Lohardaga");
	    jh.add("Kolkata");
	    jh.add("Ludhiyana");
	    
	    Map<String,List<String>> m=new HashMap<>();
	    m.put("Maharashtra", mh);
	    m.put("Jharkhand", jh);
	   
	    Set<String> keys= m.keySet();
	    
	    System.out.println("\tKeys :- "+keys);
	    System.out.println("----------------------------------------------------------------");
	    
	    Iterator<String> itr=keys.iterator();
	    
	     while(itr.hasNext())
	     {
	    	 String statekey=itr.next();
	    	 
	    	 System.out.println("\tState - "+statekey);
	    	 
	    	 List<String> state=m.get(statekey);
	    	 
	    	 Iterator<String> itr1=state.iterator();
	    	 while(itr1.hasNext())
	    	 {
	    		 String city=itr1.next();
	    		 System.out.println("\tCity - "+city);
	    		 
	    	 }
	    	 System.out.println("....................................................................................");
	     }
	     
	    
	    
	    
	
	}
}
