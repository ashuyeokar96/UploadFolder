package com.cjc.MapTask;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class CollegeWithGenricFor {
	public Map<String,Student> m1()
	{
		Map<String, Student> eng=new HashMap<>();
		
		Student s=new Student();
		s.setRollno(11);
		s.setName("Kunal Singh");
		
		Student s1=new Student();
		s1.setRollno(12);
		s1.setName("Nisha Jotwani");
		
		Student s2=new Student();
		s2.setRollno(13);
		s2.setName("Rushabh Mehata");
		
		eng.put("a",  s);
		eng.put("b", s1);
		eng.put("c", s2);
		
		return eng;
	}
	
	public static void main(String[] args) {
		CollegeWithGenricIterator c=new CollegeWithGenricIterator();
		
		Map<String,Student> m=c.m1();
		
		Set<String> keys=m.keySet();
		for(String key : keys)
		{	
			
			System.out.println("\tKey - "+key);
			Student stu=m.get(key);
			System.out.println("\tRoll No - "+stu.getRollno());
			System.out.println("\tName - "+stu.getName());
			System.out.println("........................................................................");
			
		}
		
		
	}


}
