
package lambda_expression;
@FunctionalInterface
interface Drawable{  
    public void draw1();  
}  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
       /* Drawable d=new Drawable(){ 
        	
            public void draw1(){
            	
            	
            	System.out.println("Drawing "+width);
            	
            
            }  
        };  
        d.draw1();  
        
        
        */
        
        
        Drawable d=() ->
        {
        	System.out.println("Drawing hello "+width);
        };
        
        d.draw1();
    }  
}  