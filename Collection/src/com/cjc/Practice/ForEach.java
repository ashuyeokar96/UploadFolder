package com.cjc.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ForEach {
	public static void main(String[] args) {
		
		Map<String , String> m=new HashMap<>();
		m.put("A", "Badminton");
		m.put("B","Hocky");
		m.put("C","Cricket");
		m.put("D", "HollyBall");
		
		Set<String> keys=m.keySet();
		System.out.println("Keys : "+keys);

		
		for(String key : keys)
		{
			
		   System.out.println(key);
			String game=m.get(key);		
			System.out.println(game);			
			System.out.println("-----------------------------------------------------------------");
  			
	 }
		

	}

}
