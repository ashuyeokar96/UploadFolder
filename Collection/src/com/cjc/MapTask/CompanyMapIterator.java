package com.cjc.MapTask;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.cjc.MapTask.Employee;

public class CompanyMapIterator {
	
	public Map<String ,Map<String, Employee>> designation()
	{
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("Khushi Yeokar");
		e.setSal(257000);
		
		Employee e1=new Employee();
		e1.setEid(2);
		e1.setEname("Harshu Kohali");
		e1.setSal(350000);
		
		Map<String,Employee> developer=new HashMap<>();
		developer.put("dev1", e);
		developer.put("dev2", e1);
		

		Employee e2=new Employee();
		e2.setEid(1);
		e2.setEname("Ranu Giri");
		e2.setSal(200000);
		
		Employee e3=new Employee();
		e3.setEid(2);
		e3.setEname("Anushka Patil");
		e3.setSal(150000);
		
		Map<String , Employee> tester=new HashMap<>();
		 tester.put("test1", e2);
		 tester.put("test2", e3);
		 
		 Map<String,Map<String , Employee>> team=new HashMap<>();
		 team.put("Developer", developer);
		 team.put("Tester", tester);
		 
		
		
		return team;
	}
	public static void main(String[] args) {
		
		CompanyMapIterator c=new CompanyMapIterator();
		
		Map<String ,Map<String, Employee>> m=c.designation();
		
		Set<String>  keys1=m.keySet();
		
		Iterator<String> itr=keys1.iterator();
		
		while(itr.hasNext())
		{
			String key1=itr.next();  
			System.out.println("\n\tOuter key - "+key1);
			Map<String , Employee> emp=m.get(key1);
			
			Set<String> keys2=emp.keySet();
			
			Iterator<String> itr1=keys2.iterator();
			while(itr1.hasNext())
			{
				String key2=itr1.next();
				System.out.println("\n\tInner Key - "+key2);
				
				Employee emp2=(Employee)emp.get(key2);
				System.out.println("\tEmployee Id - "+emp2.getEid());
				System.out.println("\tEmployee Name - "+emp2.getEname());
			    System.out.println("\tSalary - "+emp2.getSal());
			}
			System.out.println("\n-------------------------------------------");
			
		}
		
	}

}
