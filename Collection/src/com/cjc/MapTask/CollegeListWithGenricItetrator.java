package com.cjc.MapTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollegeListWithGenricItetrator {
	
	public Map<String,List<Student>> m1()
	{
		Student s=new Student();
		s.setRollno(101);
		s.setName("Khushi Yeokar");
		
		Student s1=new Student();
		s1.setRollno(102);
		s1.setName("Rashi Patil");
					
		List <Student> fe=new ArrayList<>();
		fe.add(s);
		fe.add(s1);
		
		Student s3=new Student();
		s3.setRollno(103);
		s3.setName("Nidhi Wasu");
		
		Student s4=new Student();
		s4.setRollno(104);
		s4.setName("Shruti Deore");
		
		
	    List<Student> se=new ArrayList<>();
	    se.add(s3);
	    se.add(s4);
			
		Map<String,List<Student>> eng =new HashMap<>();
		eng.put("First Year", fe);
		eng.put("Second Year", se);
		return eng;
	}
	
	public static void main(String[] args) {
		
		CollegeListWithGenricItetrator c=new CollegeListWithGenricItetrator();
		
		Map<String,List<Student>> m=c.m1();
		
		Set<String> keys=m.keySet();
		
		Iterator<String> itr=keys.iterator();//fy sy
		while(itr.hasNext())// false
		{
			String key=itr.next();//fy
			System.out.println("\tKey - "+key);//fy sy
			
			List<Student> student=m.get(key);//fe se
			Iterator<Student> itr1=student.iterator();//fe s,s1 se s2 s3
			
			while(itr1.hasNext())
			{
				Student st=itr1.next();//s
				System.out.println("\tRoll no - "+st.getRollno());
				System.out.println("\tName - "+st.getName());
				
			}
			System.out.println("-----------------------------------------------");
		}
		
		
	}

}
