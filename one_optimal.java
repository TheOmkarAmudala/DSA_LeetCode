import java.util.Arrays;
import java.util.*;

public class one_optimal {
     public static void main(String args[]){
        int[] arr = { 15,7,2,11};
        int[] copy = arr.clone();
        int target = 9;
        
        Arrays.sort(copy);
        for(int i = 0; i < copy.length; i++){
            int x = target - copy[i];
            int y = Arrays.binarySearch(copy, x);
            int x1 = 0;
            int x2 = 0;
            if(y >= 0){
                for(int j = 0; i < arr.length; i++){
                   
                   if(arr[j] == copy[i]){
                     x1 = j;
                   }
                   if(arr[j] == x){
                     x2 = j;
                   }

                }
                System.out.print(x1);
                System.out.print(x2);
                break;
            }
            System.out.println("no");
        }
     }    
}
