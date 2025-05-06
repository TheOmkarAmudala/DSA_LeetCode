import java.util.Arrays;

public class TowThirtyEight {
    public static void main(String Args[]){
        int[] arr = {-1,1,0,3,-3};
        System.out.println(productExceptSelf(arr));
    }
    
    public static int[] productExceptSelf(int[] nums) {
        int count = 1;
        int nonZero = 1;
        for(int num: nums){
            count *= num;
        }
        for(int num: nums){
            if(num != 0){
            nonZero *= num;
            }
        }

        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
               ans[i] = nonZero/nums[i];
            }
            if(nums[i] == 0 ){
              ans[i] = count/nums[i];
            }  
        }

        System.out.println(Arrays.toString(ans));
       return nums;
    } 
}
