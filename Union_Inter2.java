public class Union_Inter2 {
     public static void main(String args[]) {
        int arr1[] = { 2, 4, 6, 8, 10, 12, 14 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
        // common elements(Intersection of two arrays)
        int sum3=0;
        System.out.print("common elements(Intersection) :");
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 7; i++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(" ");
                    System.out.print(arr1[i]);
                    sum3=sum3+arr1[i];
                }
            }
        }
        System.out.println();
    
    
 System.out.println("Total of Intersection elements : "+sum3);




    
        // union of array elements
        System.out.print("Union of array elements : ");
          int sum1 = 0;
    int sum2 = 0;
    int total = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print(" ");
            System.out.print(arr1[i] + " " + arr2[i]);
             sum1 = sum1 + arr1[i];
        sum2 = sum2 + arr2[i];
        total = total + arr1[i] + arr2[i];
        }
        System.out.println();
        System.out.println("Total of Union elements of array : "+total);
        // total of Union elements of array
      
    


}}
