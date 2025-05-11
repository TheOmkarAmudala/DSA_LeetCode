class onefivefivezero{
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1};
        System.out.print(threeConsecutiveOdds(arr));

    }
      public static boolean threeConsecutiveOdds(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int count = 3;
       for(int num : nums){
          if(num % 2 != 0){
            count--;
          }else{
            count = 3;
          }
          if(count == 0){
            return true;
          }

       }
       return false; 
    }
}