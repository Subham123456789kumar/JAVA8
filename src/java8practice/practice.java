package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice {
	
	public static void main(String[] args) {
		
		
		
		//How to count the number of occurrences of a given word in a list of strings using Java 8?

		
		
		System.out.println("How to count the number of occurrences of a given word in a list of strings using Java 8");
		
		List<String> wordlist= Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		
		
		String giveString="apple";
		
		
		
		
		long count =wordlist.stream()
                .filter(word -> word.equals(giveString))
                .count();
		
		System.out.println(count);
		
		
		
		
		
		//How to filter an array of strings by a given prefix using Java 8 Stream?

		
		
		System.out.println("How to filter an array of strings by a given prefix using Java 8 Stream");
		
		
		String[] wordArray={"apple", "apricot", "banana", "appliance", "cherry", "application"};
		
		String prefix="app";
		
		
		List<String> filterList= Arrays.stream(wordArray)
				.filter(word -> word.startsWith(prefix))
				.collect(Collectors.toList());
		
		
		System.out.println(filterList);
		
		

		
	}

}
