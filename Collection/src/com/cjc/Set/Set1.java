package com.cjc.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {public static void main(String[] args) {
	
	Set s=new  HashSet<>();
	s.add("abc");
	s.add("pqr");
	
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		String nm=(String) itr.next();
		System.out.println(nm);
	}
		
}

}
