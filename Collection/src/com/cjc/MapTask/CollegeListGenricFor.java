package com.cjc.MapTask;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CollegeListGenricFor {

	public Map m1()
	{
		Student s=new Student();
		s.setRollno(11);
		s.setName("Virat Kohali");
		
		Student s1=new Student();
		s1.setRollno(12);
		s1.setName("Mahi Rajput");
			
		List fe=new ArrayList<>();
		fe.add(s);
		fe.add(s1);
		
		Student s2=new Student();
		s2.setRollno(13);
		s2.setName("Yuvraj Singh");
		
		Student s3=new Student();
		s3.setRollno(14);
		s3.setName("Rohit Sharma");
		
		List se=new ArrayList<>();
		se.add(s2);
		se.add(s3);
		
		Map eng=new HashMap<>();
		eng.put(1, fe);
		eng.put(2, se);
		
		return eng;
	}
	
	public static void main(String[] args) {
		CollegeListGenricFor c=new CollegeListGenricFor();
		Map m=c.m1();
		
		Set keys=m.keySet();
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=(int)itr.next();   //1    2
			
			System.out.println("\tkey - "+key );//1                            2
			
			List<String> year=(List<String>) m.get(key); //fe                      se
						
			Iterator itr1=year.iterator();//fe                   se
			while(itr1.hasNext())// true  true  false           true  true
			{
				Student stu=(Student) itr1.next();//s  s1         s2 s3
				System.out.println("\n\tRoll no - "+stu.getRollno());//11 12  13 14
				System.out.println("\tName - "+stu.getName());//Virat Kohali , Mahi Rajput , Yuvraj Singh  ,Rohit Sharma
			}
			System.out.println("----------------------------------------------------------------------");
			
		}
		
	}
}
