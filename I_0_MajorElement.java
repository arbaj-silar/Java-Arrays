public class I_0_MajorElement {
    
    public static int majorityElement(int nums[]) {
        int n = nums.length;
        for(int val: nums) {
            int freq = 0;

            for(int el: nums) {
                if(val == el) {
                    freq++;
                }
            }
            if(freq > n/2) {
                return val;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 1, 2, 2, 2, 1};

        System.out.println(majorityElement(nums));
    }
}
