package Operators;

import java.util.Scanner;

public class Eqaulandnotequal {
	 public static void main(String[] args) {
	       
	        Scanner num = new Scanner(System.in);
	        System.out.print("Enter first num : ");
	        
	        int a = num.nextInt();
	        System.out.print("Enter second num : ");
	        int b = num.nextInt();
	      
	        if (a == b) {
	            System.out.println("Both are nums equal");
	        }
	        
	        else if (a != b) {
	            System.out.println("Both are nums different");
	        }
	    }
}
