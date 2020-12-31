package com.cjc.Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {
	
	public static void main(String[] args) {
		
		Map m=new HashMap<>();
		m.put(10, "Java");
		m.put(5,"Cpp");
		m.put(15, "Python");
		
		 Set keys=m.keySet();
		 
		 System.out.println("Keys  "+keys);
		 String a=(String)m.get(keys);//null-----specified key is 
		 String b=(String) m.get(5); 
		 System.out.println(b+"\n____________________________________");
		 
		 System.out.println("values \n");
		 Iterator itr=keys.iterator();
		 while(itr.hasNext())
		 {
			 int key=(int) itr.next();
			 String str=(String) m.get(key);
			 System.out.println(str);
		 }
		 
		
	}

}
