package com.cjc.MapTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollegeMCAMBA {
	
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
		
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())   // MCA    MBA-----Keys
		{
		   String key=(String) itr.next();
		   System.out.println("\tKey - "+key);//MCA MBA
		   
		   List<Student> dep=college.get(key); //listMCA listMBA
		   
		   Iterator<Student> itr2=dep.iterator();
		   while(itr2.hasNext()) // listMCA-----s,s1   listMBA-----s2,s3
		   {
			   Student stu=itr2.next(); // s s1          s2 s3
			   System.out.println("\tRoll No - "+stu.getRollno());
			   System.out.println("\tName - "+stu.getName());
		   } 
		   System.out.println("-----------------------------------------");
		   
	   }
		   
				  
		
		
		
	}

}
