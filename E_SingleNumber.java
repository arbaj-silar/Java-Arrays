public class E_SingleNumber {
    
    public static int single(int nums[]) {
        int ans = 0;
        for(int val: nums) {
            ans ^= val;
        }

        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 3, 3, 7, 7, -9, 11, 11};

        System.out.println("Single value: "+single(nums));
    }
}
