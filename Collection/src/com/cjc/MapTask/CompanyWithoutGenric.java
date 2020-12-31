package com.cjc.MapTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;


public class CompanyWithoutGenric {
	
	public Map designation()
	{
		
		 Employee e=new Employee();
		 e.setEid(1);
		 e.setEname("Ravish Kumar");
		 e.setSal(2000000);
		 
		 Employee e1=new Employee();
		 e1.setEid(2);
		 e1.setEname("Rnchod das chanchad");
		 e1.setSal(400000);
		 
		 Set developer=new HashSet();
		 developer.add(e);
		 developer.add(e1);
		 
		 Employee e2=new Employee();
		 e2.setEid(3);
		 e2.setEname("Amit Kumar");
		 e2.setSal(250000);
		 
		 Employee e3=new Employee();
		 e3.setEid(4);
		 e3.setEname("Manny chanchad");
		 e3.setSal(150000);
		 
		 Set tester=new HashSet();
		 tester.add(e2);
		 tester.add(e3);
		 
		 Map team=new HashMap<>();
		 team.put("Developer", developer);
		 team.put("Tester", tester);
		 
		 return team;
		
	}
	
	public static void main(String[] args) {
		
		CompanyWithoutGenric c=new CompanyWithoutGenric();
		Map m=c.designation();
		 
		Set keys=m.keySet();
		
		Iterator itr= keys.iterator();
		while(itr.hasNext())
		{
			String key=(String)itr.next(); //Developer Tester
			
			System.out.println("\tKey - "+key);
			
			Set<Employee> emp=(Set<Employee>)m.get(key);
			Iterator itr1=emp.iterator();
			
			while(itr1.hasNext())
			{
				Employee e=(Employee)itr1.next();
				System.out.println("\n\t Employee Id - "+e.getEid());
				System.out.println("\t Employee Name - "+e.getEname());
				System.out.println("\t Employee Salary - "+e.getSal());
				
			}
			System.out.println("\n---------------------------------------------------------------");
		}
		
	}
	

}
