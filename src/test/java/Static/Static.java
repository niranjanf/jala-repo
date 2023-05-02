package Static;

public class Static {
// Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance 
	//methods and a main method.
	
	
	//1]
	 static int sv1 = 34;
	    static int sv2 = 23;
	    
	    int iv1 = 98;
	    int iv2 = 438;
	    
	
	//2]    
	    static void staticMethod1() {
	      
	        Static obj = new Static();
	      
	        System.out.println("Instance variables: " + obj.iv1 + ", " + obj.iv2);
	    }
	    
	    // 3.
	    void instanceMethod1() {
	        //printing Static variables
	        System.out.println("Static variables: " + sv1 + ", " + sv2);
	    }

	    // 4. 
	    static void staticMethod2() {
	      
	        Static obj = new Static();
	        obj.instanceMethod1();
	    }

	    // 5
	    void instanceMethod2() {
	      
	        staticMethod1();
	    }

	    //main method
	    public static void main(String[] args) {
	        Static stc = new Static();

	        // 8. 
	        System.out.println("Static variables: " + sv1 + ", " + sv2);
	        System.out.println("Instance variables: " + stc.iv1 + ", " + stc.iv2);

	        // 7.
	        staticMethod1();
	        staticMethod2();
	       
	        stc.instanceMethod1();
	        stc.instanceMethod2();
	    }

}
