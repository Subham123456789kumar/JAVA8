package java8practice;

import java.io.BufferedOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class mypractice {

	
	public static void main(String[] args) {
		
		
		
		
		// How to iterate and modify values in a Map using Java 8?


		Map<String, Integer> map= new HashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C",3 );
		map.put("D",4 );
		map.put("E",5 );
		map.put("F",6 );
		map.put("G",7 );
		
		
		
		System.out.println(map);
		
		
		/*System.out.println("modifiable map");
		map.forEach((key , value) -> {
			
			
			map.put(key, value+1);
			
		});
		
		*/
		
		
		
    map.replaceAll((key , value) -> value+1);

		
		
		System.out.println(map);
		
		
		
		
		
		
		// How to print keys & values of a Map using Java 8 ?
		
	   //How many ways are there to print keys & values of a Map ?


		
		
		
		// iterate element
		
		System.out.println("iterating elemet");
		
		
		for (String  key : map.keySet()) {
			
			
			System.out.println("key"+key + " , value "+map.get(key));
			
		}
		
		
		
		
		System.out.println("__________________________________");
		
		for (Integer value : map.values()) {
			
			
			
			System.out.println("value"+value);
			
		}
		
		
		System.out.println("_____________________________");
		
		
		
		Iterator<Map .Entry<String, Integer>> iterator= map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			
			Map .Entry<String, Integer> emEntry= iterator.next();
			
			System.out.println("key"+emEntry.getKey() + " , value "+emEntry.getValue());
			
		}
		
		
		
		// java 8
		
		
	    map.entrySet().stream().forEach(System.out::println);

		
		
		
		// How to convert String to Date Object using Java 8 ?

		
		
		System.out.println("java  date time");
		
		
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("d/MM/yyyy");
		 String date= "24/09/2024";
		 
		 LocalDate localDate= LocalDate.parse(date, formatter);
		 
		 
		 System.out.println(localDate);
		

		 
		 
		 // retrieve values from Set using Java 8 ?

		
		 
		 
		 System.out.println("retrive  elemet  java 8");
		 
		 
		 
		 
		 
		 Set set = new HashSet<>();
		 set.add(1);
		 set.add(2);
		 set.add(3);
		 set.add(4);
		 set.add(5);
		 set.add(6);
		 set.add(7);
		 
		 
		 
		 System.out.println(set);
		 
		 
		 
		    set.stream().forEach(System.out::println);
		    
		    
		   //count occurrences of each character of a String in Java 8?
		    
		    
		  System.out.println("Counting occurince");
		    
		    
		    String str="communication";
		    
		    
		    Map<String, Long> result=Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s-> s,LinkedHashMap:: new, Collectors.counting()));
		    
		    
		    System.out.println(result);
		    
		    
		    
		    
		    
		    //remove all duplicates from an array of integers in Java using Java 8?

		    
		    
		    
		    System.out.println("remove all duplicates from an array of integers in Java using Java 8?\r\n"
		    		+ "");
		    
		  List<Integer> item= new ArrayList<>(Arrays.asList(1,2,1,2,3,4,5,6,6,6));
		    
          Set<Integer> set2= new HashSet<>(item.size());
          
          item.removeIf( p -> !set2.add(p));
          
          
          System.out.println(item);
          
          
          
          
          
          
          
          
          ArrayList<Integer> numList= new ArrayList<>(Arrays.asList(1,2,2,3,4,5,3,4,3,4));
          
          
          List<Integer> listWithoutdupList= numList.stream().distinct().collect(Collectors.toList());
          
          
          
          System.out.println(listWithoutdupList);
          
          
          
          
          
          
          
          
          
         
		

		
	}
}
