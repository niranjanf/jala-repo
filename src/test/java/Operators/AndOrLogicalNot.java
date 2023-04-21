package Operators;

public class AndOrLogicalNot {
	public static void main(String[] args) {
        int a = 23;
        int b = 14;
        int c = 6;
        // 
        /* . */
        System.out.println(a > b && a > c); // true  && true  = true
        System.out.println(a < b && a < c); // false && false = false
        System.out.println(a > b && a < c); // true  && false = false

        //Logical OR (||)
        /* 
         */
        System.out.println(a > b || a > c); // true  || true  = true
        System.out.println(a < b || a < c);
        System.out.println(a < b || a > c);

        System.out.println(!(a > b));     
        System.out.println(!(a < b));      
    }

}
