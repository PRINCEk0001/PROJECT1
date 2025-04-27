import java.util.*;

public class patternfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // First loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Single space
            }
            // Second loop for stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Star followed by one space
            }
            System.out.println(); // Move to next line
        }
        sc.close();
    }
}
