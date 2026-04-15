public class G_0_MaxSubarraySum {

    // Brute Approach
    public static int maxSubArraySum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            int currSum = 0; 
            for(int j=i; j<nums.length; j++) {
                currSum += nums[j];
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {3, -4, 6, 2, -3, 8}; 

        System.out.println("Max sum: " + maxSubArraySum(nums));
    }
}