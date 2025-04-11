import java.util.Scanner;
public class looponeonetoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Print numbers from 1 to N
        System.out.print("Enter to print numbers from 1 to N :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println(i);
        }
    }
}
