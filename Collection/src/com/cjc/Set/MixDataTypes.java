package com.cjc.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MixDataTypes {
	
	public static void main(String[] args) {
		
		Set s=new HashSet<>();
		s.add("abc");
		s.add("pqr");
		s.add(10);
		s.add(10.1);
		s.add(30);
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			if(o instanceof Integer)
			{
				System.out.println("Integer values - "+o);
			}
			else if(o instanceof Double)
			{
				System.out.println("Double values - "+o);
			}
			else if(o instanceof String)
			{
				System.out.println("String values - "+o);
			}
		}
		
		
	}

}
