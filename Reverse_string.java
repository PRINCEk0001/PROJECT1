public class Reverse_string {
    public static void main(String[] args) {
        String str = "Hello Java";
        int arr[]={1,2,3,4,5,6,7,8};
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    
    }
}
