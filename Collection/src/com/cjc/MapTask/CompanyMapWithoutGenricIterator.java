package com.cjc.MapTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.cjc.MapTask.Employee;

public class CompanyMapWithoutGenricIterator {
	public Map designation()
	{
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("Khushi Yeokar");
		e.setSal(257000);
		
		Employee e1=new Employee();
		e1.setEid(2);
		e1.setEname("Harshu Kohali");
		e1.setSal(350000);
		
		Map developer=new HashMap<>();
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
		
		Map tester=new HashMap<>();
		 tester.put("test1", e2);
		 tester.put("test2", e3);
		 
		 Map team=new HashMap<>();
		 team.put("Developer", developer);
		 team.put("Tester", tester);
		 
		 return team;
		
	}
	
	public static void main(String[] args) {
		
		CompanyMapWithoutGenricIterator c=new CompanyMapWithoutGenricIterator();
		
		Map m=c.designation();
		
		Set keys1=m.keySet();
		
		Iterator itr=keys1.iterator();
		while(itr.hasNext())
		{
			String key1=(String)itr.next();
			System.out.println("\tOuterKey  - "+key1);
			
			Map emp=(Map) m.get(key1);
			
			Set keys2=emp.keySet();
			
			Iterator itr1=keys2.iterator();
			while(itr1.hasNext())
			{
			   String key2=(String)itr1.next();
			   			   
		       System.out.println("\tInnerKey - "+key2);
		       Employee empp=(Employee)emp.get(key2);  
		       System.out.println("\n\tEmployee Id - "+empp.getEid());
		       System.out.println("\tEmp Name - "+empp.getEname());
		       System.out.println("\tSalary - "+empp.getSal());
			
			
			}
			System.out.println("-----------------------------------------------------");
		}
		
		
	}

}
