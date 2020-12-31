package com.cjc.MapTask;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;

public class CompanyWithGenricFor {
	public Map<String , Set<Employee>> designation()
	{
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("Kirti Changani");
		e.setSal(300000);
		
		Employee e1=new Employee();
		e1.setEid(2);
		e1.setEname("Arati Mahore");
		e1.setSal(350000);
		
		Set<Employee> developer=new HashSet<>();
		developer.add(e);
		developer.add(e1);
		

		Employee e2=new Employee();
		e2.setEid(1);
		e2.setEname("Sakshi Tanna");
		e2.setSal(150000);
		
		Employee e3=new Employee();
		e3.setEid(2);
		e3.setEname("Payal Revatkar");
		e3.setSal(450000);
		
		Set<Employee> tester=new HashSet<>();
		tester.add(e2);
		tester.add(e3);
		
		Map<String , Set<Employee>> team=new HashMap<>(); 
		team.put("Developer", developer);
		team.put("Tester", tester);
		return team;
	}
	
	public static void main(String[] args) {
		
		CompanyWithGenricFor c=new CompanyWithGenricFor();
		Map<String,Set<Employee>> m=c.designation();
		
		Set<String> keys=m.keySet();
		
		for(String key :keys)
		{
			System.out.println("\n\tKey - "+key);
			Set<Employee> emp=m.get(key);
			
			   for(Employee em : emp)
			   {
			     System.out.println("\n\t Employee Id - "+em.getEid());
			     System.out.println("\t Employee Name - "+em.getEname());
			     System.out.println("\t Employee Salary - "+em.getSal());
			   }
		   System.out.println("-----------------------------------");
	   }
		
		
	}

}
