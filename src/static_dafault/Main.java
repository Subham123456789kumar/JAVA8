package static_dafault;

interface A
{
	 public static  void sayHello()
	 {
		 System.out.println("hello");
	 }
}


public class Main implements A {
	
	public static void main(String[] args) {
		
		
		A.sayHello();
		
		
		
	}

}
