import java.util.Scanner;
class  secand{
    public static void main(String[] args){
        // finding the remainder using modulus operator
        System.out.println("Remainder of two numbers");
        // Taking two integers as input from the user
        System.out.print("Enter first numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int c = a % b;
        // Printing the remainder of two numbers
        System.out.println("Remainder of two numbers is : " + c);
        
    }
}
