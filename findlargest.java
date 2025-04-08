public class findlargest {
    public static void main(String[] args) {
        // Find the largest of three numbers
        int a = 5, b = 10, c = 7;
        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
    }
}
