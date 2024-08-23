package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface {

	
	public static void main(String[] args) {
		
		
		Consumer<String> consumer= s->System.out.println(s);
		
		consumer.accept("subham");
		
		
		Consumer<List<Integer>> listIntegerConsumer= li ->
		{
			for (Integer i :li) {
				
				System.out.println( i+100);
				
			}
		};
		
		
		
		listIntegerConsumer.accept(Arrays.asList(1,2,3,4,5));
		
	}
	
	
	
	
}
