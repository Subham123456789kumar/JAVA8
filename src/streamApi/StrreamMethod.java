package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.ls.LSOutput;

public class StrreamMethod {
	
	
	public static void main(String[] args) {
		
		
	List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);	
	List<Integer> filterList=list.stream().filter(x -> x%2 ==0).collect(Collectors.toList());
	System.out.println(filterList);
		
	
	
	List<Integer> mappList=filterList.stream().map(x -> x/ 2).collect(Collectors.toList());
	System.out.println(mappList);
	

		List<Integer> list2= Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,22,33,44,55,66,77,88);
		List<Integer> filterList2= list.stream()
				.filter( x -> x %2 ==0)
				.map( x-> x/2)
				.peek(x-> System.out.print(x))
				.distinct()
				.sorted((a ,b) ->( a-b))
				.limit(4)
				.skip(1)
				.collect(Collectors.toList());
		
		
		
		System.out.println(filterList2);

		
		
		List<Integer> list3=  Arrays.asList(1,2,3,4);
		
		// it used to when  we have  large   array  or list it divide the  chunks the list and   give the different  the thread  and execute independently 
		
		list.parallelStream();
		
		
		
		
		long integer= Stream.iterate(0, x -> x+1).limit(101).map(x -> x /20).distinct().count();
		
		
		System.out.println(integer);
		
		
		
	}

}
