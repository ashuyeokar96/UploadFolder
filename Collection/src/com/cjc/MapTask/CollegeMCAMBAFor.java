package com.cjc.MapTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollegeMCAMBAFor {
public static void main(String[] args) {
		
		Student s=new Student();
		s.setRollno(1);
		s.setName("Nikita Modake");
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("Shriti Irani");
		
		List<Student> listMCA=new ArrayList<>();
		listMCA.add(s);
		listMCA.add(s1);
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("Shree Yeokar");
		
		Student s3=new Student();
		s3.setRollno(3);
		s3.setName("Laxmi Deore");
		
		List<Student> listMBA=new ArrayList<>();
		listMBA.add(s2);
		listMBA.add(s3);
		
		Map<String , List<Student>> college=new HashMap<>();
		college.put("MCA", listMCA);
		college.put("MBA", listMBA);
		
		
		Set<String> keys=college.keySet();//MCA MBA
		
		for(String key : keys)
		{
			System.out.println("\tKey - "+key);//MCA       MBA
			List<Student> val=college.get(key);//listMCA   listMBA
			
			for(Student stu  : val)//s s1                   s2,s3
			{
				System.out.println("\n\tRoll no - "+stu.getRollno());
				System.out.println("\tName - "+stu.getName());
				
			}
			System.out.println("----------------------------------");
			
		}
		
		
	   }
		   
				  
		
		

}
