package functionalInterface;


 interface A
 {
	 public String say();
 }

// it contain only  single abstract  method and any number of static  and default method 
 
 

public class Functionalinterface_lembda {
	
	public static void main(String[] args) {
		
		
		
		
		A obj=()->
		{
			return "hello";
		};
		
		System.out.println(obj.say());
		
	}

}
