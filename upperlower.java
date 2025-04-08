public class upperlower {
    public static void main(String[] args) {
        // Check if a character is uppercase or lowercase
        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is uppercase.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is lowercase.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
