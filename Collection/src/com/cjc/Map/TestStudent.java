package com.cjc.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("Virat");
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("Shree");
		
		Map<String,Student> m=new HashMap<>();
		m.put("BE", s1);
		m.put("MCA", s2);
		
		Set<String> keys=m.keySet();
		
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println("Department\t"+key);
			Student s=m.get(key);
			System.out.println("\tRoll No - "+s.getRollno());
			System.out.println("\tName - "+s.getName());
			System.out.println("------------------------------------------------");
			
		}
		
	}

}
