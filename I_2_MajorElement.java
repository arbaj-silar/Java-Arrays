public class I_2_MajorElement {
    public static int majorityElement(int nums[]) {
        int n = nums.length;
        int freq = 0, ans = -1;

        for(int i=0; i<nums.length; i++) {
            if(freq == 0) {
                ans = nums[i];
            } if(ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
            if(freq > n/2) {
                return ans;
            }
        }

        for(int val: nums) {
            if(ans == val) {
                freq++;
            }
        }

        if(freq > n/2) return ans;
        else return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 1, 2, 2, 2, 1};

        System.out.println(majorityElement(nums));
    }
}
