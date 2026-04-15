public class H_0_PairSum {
    
    public static int[] pairSum(int nums[], int tar) {
        int pair[] = new int[2];

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j] == tar) {
                    pair[0] = nums[i];
                    pair[1] = nums[j];
                    return pair;
                }
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int nums[] = {-3, 0, 2, 7, 11};

        int pair[] = pairSum(nums, 11);
        for(int val: pair) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
