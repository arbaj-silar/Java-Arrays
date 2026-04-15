public class D_Reverse {
    
    public static void reverse(int nums[]) {
        int st = 0, end = nums.length-1;

        while(st < end) {
            nums[st] ^= nums[end];
            nums[end] ^= nums[st];
            nums[st] ^= nums[end];

            st++; end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};

        reverse(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();
    }    
}
