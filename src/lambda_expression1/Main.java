package lambda_expression1;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		/*Message msg= () ->
				{
			return "say hello";
				};
		*/
		
		
		Message msg= () -> "say hello";

				
				System.out.println(msg.sayHello());
		
	}

}
