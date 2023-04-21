package lOops;

import java.util.Scanner;

public class malefemale {
	
	 public static void main(String[] args) {

	        System.out.print("Enter a Character (M/F)  : ");
	        Scanner sc = new Scanner(System.in);
	        //The Java String class "charAt()" method returns a char value at the given index number.
	        char Gen = sc.next().charAt(0);
	        
	        switch (Gen) {
	            
	            case 'M':
	                System.out.println("Gender is Male");
	                break;
	            case 'F':
	                System.out.println("Gender is Female");
	                break;
	        }
	    }

}
