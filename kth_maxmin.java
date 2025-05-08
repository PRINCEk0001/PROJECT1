//Find the 'Kth' max and min element of an array
public class kth_maxmin {
    public static void main(String[] args) {
        
        int arr[] = { 28,23,5,14,15,77,2 };
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for(int k=0;k<arr.length;k++){
            System.out.print(" "+arr[k]);
        }
        int k=0;
        int kthmin=arr[k+1];
        int kthmax=arr[arr.length-1];
        System.err.println();
        System.out.println("kth maximum element is : "+kthmax);
        System.out.println("kth minimum element is : "+kthmin);
        
    }
}
