package streamApi;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		int []array= {1,3,8,9,4,66};
		
		int sum=0;
		
		for (int i = 0; i < array.length; i++) {
			
			
			if (array[i]%2==0) {
				
				sum=sum+array[i];
				
			}
			
			
		}
		
		
		System.out.println(sum);
		
		
		
		// use  stream API
		
		
		
		int  sum2= Arrays.stream(array).filter(n -> n%2==0).sum();
		
		
		
		System.out.println(sum2);
		
		
		
		
		
	}

}
