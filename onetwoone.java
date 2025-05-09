import java.util.Arrays;

class onetwoone {
    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};
        System.out.print(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int min = 0;
        int[] profit = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < prices[min]){
                min = i;
            }
            profit[i] = prices[i] - prices[min];
        }
        

        return findmax(profit);
    }

    public static int findmax(int[] profit){
        int max = profit[0];
        for(int num : profit){
            if(num > max){
                max = num;
            }
        }
        return max; 
    }
}