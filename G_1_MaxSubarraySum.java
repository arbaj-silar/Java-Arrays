public class G_1_MaxSubarraySum {
     public static int maxSubArraySum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int val: nums) {
            currSum += val;
            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {3, -4, 7, 2, -1, 8}; 

        System.out.println("Max sum: " + maxSubArraySum(nums));
    }
}
