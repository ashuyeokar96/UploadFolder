package com.cjc.Map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		
		Map m=new HashMap<>();
		m.put(10, "Java");
		m.put(5, "Python");//old value
		m.put(15, "Cjc");
		m.put(5, "Scala");//old value is override by new value
		m.put(7, "Scala");
		//m.put('a', "C");
		System.out.println(m);
		
	}

}
