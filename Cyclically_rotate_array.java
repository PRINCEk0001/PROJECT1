public class Cyclically_rotate_array  {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int last=arr[6];
    
          
        for(int i=6;i>0;i--){
          
            arr[i]=arr[i-1];
            
        }
    arr[0]=last;
        for(int k=0;k<7;k++){
            System.out.print( " "+ arr[k]);
        }
        
        
    }
    
}
