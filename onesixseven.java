import java.util.Arrays;

public class onesixseven {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,9,56,90};
        System.err.println(Arrays.toString(twoSum(nums,8)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
           for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            int ans = search(nums,x, i );
            
            
            if(ans > 0){
               indices[0] = i + 1;
               indices[1] = ans + 1;

               return indices;
            }
           }
        return nums;
    }

    private static int search(int[] nums,int x, int i) {
        int s = 0;
        int e = nums.length - 1 ;
        while(s <= e){
            int mid = (s + e) / 2;
            if(x == nums[mid]   ){
                if(mid == i &&  nums[mid + 1] == nums[mid]){
                   return mid+1;
                }
                return mid;
            }
            else if(x > nums[mid]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
       return -1;
    }
}
