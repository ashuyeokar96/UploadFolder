package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollegeWithoutGenric {
	public Map m1()
	{
		Student s=new Student();
		s.setRollno(1);
		s.setName("Kriti");
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("Rshmi");
		
		Student s2=new Student();
		s2.setRollno(3);
		s2.setName("Nisha");
		
		Map eng=new HashMap<>();
		eng.put(1, s);
		eng.put(2, s1);
		eng.put(3, s2);
		
		
		return eng;
	}
	
	public static void main(String[] args) {
		
		CollegeWithoutGenric c=new CollegeWithoutGenric();
		
		Map m=c.m1();
		
		Set keys=m.keySet();
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{	
		     int key=(int) itr.next();
		     System.out.println("Key - "+key);
		     Student stu=(Student) m.get(key);
		     System.out.println("\tRoll No - "+stu.getRollno());
		     System.out.println("\tName - "+stu.getName());
		     System.out.println("\n..............................................................................");
		}
	}

}
