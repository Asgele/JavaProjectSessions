package day10Examplesmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap {

	private static Object country;

	public static void main(String[] args) {
	
 Map<String,String>countries = new HashMap<>();	
	countries.put("SU" ,"Sudan");
	countries.put("TG", "Tigray");
	System.out.println(countries.get("SU"));

System.out.println(countries.keySet());	
System.out.println(countries.values());	
System.out.println(countries.entrySet());	

for(Map.Entry country:countries.entrySet()) {	
System.out.println(country.getKey()+ ":" + country.getValue());	
	}
 	
	}
}
