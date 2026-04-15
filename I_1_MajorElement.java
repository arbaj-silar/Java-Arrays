import java.util.Arrays;

public class I_1_MajorElement {
    public static int majorityElement(int nums[]) {
        int n = nums.length;
        Arrays.sort(nums);
        int freq = 1, ans = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                freq++;
            } else {
                ans = nums[i];
                freq = 1;
            }
            if(freq > n/2) {
                return ans;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 1, 2, 2, 2, 1};

        System.out.println(majorityElement(nums));
    }
}
