class Union_Inter {
    public static void main(String args[]) {
        int arr1[] = { 2, 4, 6, 8, 10, 12, 14 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
        // common elements(Intersection)
        System.out.print("common elements(Intersection) :");
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 7; i++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(" ");
                    System.out.print(arr1[i]);
                }
            }
        }
        System.out.println();
        // Union of array elements
        System.out.print("Union of array elements : ");
        for (int i = 0; i < 7; i++) {
            System.out.print(" ");
            System.out.print(arr1[i] + " " + arr2[i]);

        }
        System.out.println();
        // total of Union elements of array
        int sum1 = 0;
         int sum2 = 0;
         int total=0;
        
        for (int i = 0; i < 7; i++) {
            
                sum1 = sum1 + arr1[i] ;
                sum2 = sum2+ arr2[i];
                total=total+ arr1[i] + arr2[i];
            
        }
        System.out.println("Total of Union elements of array : " + total );
        // total of Intersection elements of array

    }

}