package com.cjc.MapTask;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollegeListWithoutGenricIterator {
	
	public Map m1()
	{
		Student s=new Student();
		s.setRollno(101);
		s.setName("Shreya panjwani");
		
		Student s1=new Student();
		s1.setRollno(102);
		s1.setName("Kiya Sharma");
				
		List fe=new ArrayList<>();
		fe.add(s);
		fe.add(s1);
		
		Student s2=new Student();
		s2.setRollno(103);
		s2.setName("Laxmi Deore");
		
		Student s3=new Student();
		s3.setRollno(104);
		s3.setName("Ria Verma");
		
		List se=new ArrayList<>();
		se.add(s3);
		se.add(s2);
		 
		Map eng=new HashMap<>();
		eng.put("FY", fe);
		eng.put("SY",se);
		
		return eng;
	}
	public static void main(String[] args) {
		
		CollegeListWithoutGenricIterator c=new CollegeListWithoutGenricIterator();
		
		Map m=c.m1();
		
		Set keys=m.keySet();
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=(String)itr.next();
			System.out.println("\tyear - "+key);
			
			List<String> year= (List<String>) m.get(key);
			
			Iterator itr1=year.iterator();
			
			while(itr1.hasNext())
			{
				Student stu=(Student)itr1.next();
				System.out.println("\n\tRoll no - "+stu.getRollno());
				System.out.println("\tName - "+stu.getName());
			}
			System.out.println("\n--------------------------------------------------------------------");
			
		}
		
		
	} 
	

}
