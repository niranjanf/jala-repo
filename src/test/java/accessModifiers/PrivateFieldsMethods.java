package accessModifiers;

public class PrivateFieldsMethods {
	 private String name = "niranjan";
	    private int age = 26;

	    
	    private void pvtMethod() {
	        System.out.println("My Name is " + name + " and my age is " + age);
	    }

	   
	    public static void main(String[] args) {
	        PrivateFieldsMethods obj = new PrivateFieldsMethods();
	
	        System.out.println(obj.age);
	        System.out.println(obj.name);
	       
	        obj.pvtMethod();
	    }
	   
}
