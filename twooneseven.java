import java.util.*;
class Solution {
    public static void main(String arg[]){
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
       HashSet<Integer> seen = new HashSet<>();
       

      for(int num : nums){
         if(seen.contains(num)){
            return true;
      }
         seen.add(num);
      }
       return false;
    }
}