package Operators;

public class Incrementanddecrement {
	
	 static void preIncrement(int a, int b) {
	        int d;                  
	        d = b + (++a);          
	        System.out.println("Values after Pre-Increment a,b : " + a + "," + d);
	    }

	    static void postIncrement(int a, int b) {
	        int d;                  
	        d = b + (a++);        
	        System.out.println("Values after Post-Increment a,b : " + a + "," + d);
	    }

	  
	    static void preDecrement(int a, int b) {
	        int d;                 
	        d = b + (--a);         
	        System.out.println("Values after Pre-Decrement a,b : " + a + "," + d);

}
}