class arrreverse{
    public static void main(String[] args) {
         int arr[] = {1, 2, 3, 4, 5};
        reverse(arr); // Pass only the array
        for (int i = 0; i < arr.length; i++) { // Use arr.length directly
             System.out.print(arr[i] + " ");
         }
     }

    static void reverse(int arr[]) { // Removed the 'n' parameter
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
             // swap
             int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
     }
}
