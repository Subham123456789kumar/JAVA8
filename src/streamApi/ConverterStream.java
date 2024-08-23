package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConverterStream {
	
	
	public static void main(String[] args) {
		
		
		
		List<String> list= Arrays.asList("apple","mohan","tony","subham","komal");
	
	     Stream<String> myStream= list.stream();
	     
	     
	     
	     String [] array= {"apple","Bnana","chery"};
	     Stream<String> stream= Arrays.stream(array);
	     
	     
	     
	     Stream<Integer> inStream= Stream.of(1,2,3,4,5,6);
	     
	
	     
	     Stream<Integer> limiStream=Stream.iterate(0, n -> n+1).limit(100);
	
	     
	     Stream<Integer> limit= Stream.generate( () -> (int) Math.random()*100).limit(101);
	     
	}

}
