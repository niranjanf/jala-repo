package Interface;

public class interfaceprivatemethd {
	interface Jala_09 {

	    public int num1 = 56;
	    static final int num2 = 78;
	    final int num3 = 79;
	   
	}

	class InterfacePrivateProtected implements Jala_09 {

	    public void main(String[] args) {
	        InterfacePrivateProtected if9 = new InterfacePrivateProtected();
	        System.out.println(if9.num1 + " " + if9.num2);
	    }
}
}