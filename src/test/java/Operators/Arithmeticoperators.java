package Operators;

public class Arithmeticoperators {

	

    static void addition(int a, int b) {
        int add = a + b;
        System.out.println("addition of a + b = " + add);
    }

    static void subtraction(int a, int b) {
        int sub = a - b;
        System.out.println("subtraction of a - b = " + sub);
    }

    static void multiplication(int a, int b) {
        int mul = a * b;
        System.out.println(" multiplication of a * b = " + mul);
    }

    static void division(int a, int b) {
        int div = a / b;
        System.out.println("division of a / b = " + div);
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }
}
