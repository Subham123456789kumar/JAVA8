package static_dafault;

interface B
{
	 default  void  sayHii(){
		 
		 
		 System.out.println("hii B");
		 
	 }
}


interface C 
{
	

	default  void  sayHii(){
		 
		 
		 System.out.println("hii C");
		 
	 }

	
}

public class Main2 implements B  {
	
	public static void main(String[] args) {
		
		Main2 obj= new Main2();
		obj.sayHii();
		

		
		
	}

	

	

}
