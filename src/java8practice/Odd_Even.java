package java8practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Iterator;

public class Odd_Even {

	public static void main(String[] args) {

		List<Integer> listOfintegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		System.out.println("even list");

		List<Integer> eveList = listOfintegers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		Iterator iterator = eveList.iterator();
		System.out.println("even number: ");

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			System.out.println();
		}

		System.out.println(eveList);

		// odd list

		System.out.println("odd list");

		List<Integer> oddList = listOfintegers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());

		Iterator iterator2 = oddList.iterator();

		while (iterator2.hasNext()) {

			System.out.println(iterator2.next());

		}

		System.out.println("second argest number");
		
		

		// second largest number
		

		List<Integer> secondLargestNumbar = listOfintegers.stream().sorted().collect(Collectors.toList());

		System.out.println(secondLargestNumbar);

		Optional<Integer> secondLargestOptional = listOfintegers.stream().distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst();
		System.out.println("second largest" + secondLargestOptional);
		
		
		
		// find  sum and average of all  element
		
		
		int sum1=listOfintegers.stream().reduce(0,(a,b) ->(a+b));
		
		long count1= listOfintegers.stream().count();
				

		
		System.out.println("sum "+sum1);
		System.out.println("average "+sum1/count1);
		
		
		double average=listOfintegers.stream().mapToDouble(Integer :: doubleValue).average().orElse(0.0);
		

		
		System.out.println(average);
		
		
		
		// string  start with a number
		
		System.out.println("string number");
		
		
		
		  List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four",  "5ive",  "Six");
		
		  List<String> startWithNumbList=listOfStrings.stream().filter(s -> !s.isEmpty() && Character.isDigit(s.charAt(0))).collect(Collectors.toList());
		  
		 
		  
		  System.out.println(startWithNumbList);
		  
		
		  
		 // List<String> startWithANumberList=listOfStrings.stream().filter( a -> a.startsWith("5")).collect(Collectors.toList());
		
		  
		  
		  
		  

	}

}
