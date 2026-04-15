public class H_1_PairSum {
    public static int[] pairSum(int nums[], int tar) {
        int st = 0, end = nums.length-1;

        while(st < end) {
            if(nums[st]+nums[end] == tar) {
                return new int[] {nums[st], nums[end]};
            }

            if(nums[st]+nums[end] > tar) {
                end--;
            } else {
                st++;
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int nums[] = {-3, 0, 2, 7, 11};

        int pair[] = pairSum(nums, 7);
        for(int val: pair) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
