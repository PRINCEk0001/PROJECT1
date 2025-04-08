import java.util.Scanner;

class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adding of two numbers");
        // Taking two integers as input from the user
        System.out.print("Enter first numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int c = a + b;
        // Printing the sum of two numbers
        System.out.println("Sum of two numbers is : " + c);



        System.out.println(" subtraction of two numbers");
        // Taking two integers as input from the user
        System.out.print("Enter first numbers : ");
        int d = sc.nextInt();
        System.out.print("Enter second number: ");
        int e = sc.nextInt();
        int f = d - e;
        // Printing the subtraction of two numbers
        System.out.println("Subtraction of two numbers is : " + f);


        System.out.println(" multiplication of two numbers");
        // Taking two integers as input from the user
        System.out.print("Enter first numbers: ");
        int g = sc.nextInt();
        System.out.print("Enter second number: ");
        int h = sc.nextInt();
        int i= g * h;
        // Printing the multiplication of two numbers
        System.out.println("multiplication of two numbers is : " + i);


        System.out.println(" division of two numbers");
        // Taking two integers as input from the user
        System.out.print("Enter first numbers: ");
        int j = sc.nextInt();
        System.out.print("Enter second number: ");
        int k = sc.nextInt();
        int l = j / k;
        // Printing the division of two numbers
        System.out.println("division of two numbers is : " + l);
        
    }
}