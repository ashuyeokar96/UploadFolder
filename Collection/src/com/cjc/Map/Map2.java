package com.cjc.Map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	
	public static void main(String[] args) {
		
		Map<Character , String> m=new HashMap<>();
		m.put('a', "Java");
		m.put('b', "Python");//old value
		m.put('c', "Cjc");
		m.put('d', "Scala");//old value is override by new value
		m.put('e', "Scala");
	}

}
