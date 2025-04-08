public class swaptem {
    public static void main(String[] args) {
        // Swapping two numbers using a third variable
        int a = 5, b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        // Swapping two numbers without using a third variable
        a = 5; // Resetting values for demonstration
        b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping without third variable: a = " + a + ", b = " + b);
}}
