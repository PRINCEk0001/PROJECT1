//Move all negative numbers to beginning and positive to end
public class Short_pos_nav {
    public static void main(String[] args) {
        int arr[] = { 1, -2, -3, 4, 5, 6, 2, 3, 9, -1 };
        int n = arr.length;
        int temp = 0;

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
            // else if(arr[i]>0){
            // temp=arr[i];
            // arr[i]=arr[i-1];
            // arr[i-1]=temp;
            // }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
