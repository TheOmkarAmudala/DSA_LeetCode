
import java.util.Arrays;
import java.util.HashSet;

public class oneTwentyEight {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.print(longestlength(nums));
    }

    private static int longestlength(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
    
        int j = 0;
        int count = 0;
        int[] c = new int[nums.length];
        int target = nums[0];
        int L = longestNumber(nums);
    
        while (j < nums.length) {
            // Only start a new sequence if nums[j] is the start (no num[j] - 1)
            if (!set.contains(nums[j] - 1)) {
                target = nums[j];
                count = 0;
    
                while (set.contains(target)) {
                    count++;
                    target++;
                }
                c[j] = count;
            }
    
            j++;
        }
    
        System.err.println(Arrays.toString(c));
        return longestNumber(c);
    }
    

    public static int longestNumber(int[] nums) {
        int max = nums[0];
        for(int num: nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    }