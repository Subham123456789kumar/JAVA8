package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
	
	
	public static void main(String[] args) {
		
		
		
	/*	Predicate<Integer> predicate= x -> x>100000;
		
		
		System.out.println(predicate.test(10000));
		
		
		int salary=900000000;
		
		if (predicate.test(salary)) {
			
			
			
			System.out.println(" good salary");
			
		}
		
		
		*/
		
		
		
		
	/*	List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		// use stream 

		 int sum = numbers.stream().filter(n -> n%2==0).mapToInt(n -> n).sum();
		
		
		 // use iterative approach
		 
		 System.out.println(sum);
		 
		 
		 int sum2= 0;
		  for (int number : numbers) {
			  
			  
			  if (number%2==0) {
				  
				  sum2+= number;
				
			}
			  
			  
			  
			
		}
		  
		  System.out.println(sum2);

		*/
		
		
		
		
		// predicate 
		
		int sum=0;
	/*	
		Predicate<Integer> isEven= x-> x%2==0;
		
		List<Integer>  numbers=Arrays.asList(1,2,3,4,5);
		
		for(Integer i: numbers)
		{
			if (isEven.test(i)) {
				
				
				sum=sum+i;
				
				
			}
		}
		  
		
		
		System.out.println(sum);
		
		
		
		*/
		
		
		Predicate<String> startWithS= x -> x.toLowerCase().charAt(0)=='s';  
		
		Predicate<String> endtWithM= x -> x.toLowerCase().charAt(x.length()-1)=='m';  

		Predicate<String> and= startWithS.and(endtWithM);
		Predicate<String> or= startWithS.or(endtWithM);

		System.out.println(and.test("subham"));
		
		System.out.println(or.test("bvnbm"));
		
		
	}

}
