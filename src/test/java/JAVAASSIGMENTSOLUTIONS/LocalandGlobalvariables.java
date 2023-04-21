package JAVAASSIGMENTSOLUTIONS;

public class LocalandGlobalvariables {
	 int a = 43;
	    void local() {
	        
	        int a = 22;
	        System.out.println("Local variable a : " + a);
	    }

	    public static void main(String[] args) {
	        LocalandGlobalvariables obj = new LocalandGlobalvariables();
	        System.out.println("Instance variable a : " + obj.a);
	        
	        obj.local();
}
}