package Interface;

public class inheritedinterface {
	interface Jala_7 {
	    void methodOne();

		void methodTwo();
	}

	interface Jala_07 extends Jala_7 {
	    void methodTwo();

		void methodOne();
	}

	class InheritedInterface implements Jala_07 {
	   
	    public void methodOne() {
	        System.out.println("This is first method");
	    }
	
	    public void methodTwo() {
	        System.out.println("This is second method");
	    }

	    public void main(String[] args) {
	        InheritedInterface if7 = new InheritedInterface();
	      
	        if7.methodOne();
	        if7.methodTwo();
	    }
	}
}
