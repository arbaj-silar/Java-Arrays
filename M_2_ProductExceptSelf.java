public class M_2_ProductExceptSelf {
    public static int[] productExceptSelf(int nums[]) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i=0; i<n; i++) {
            ans[i] = 1;
        }

        for(int i=1; i<n; i++) {
            ans[i] = nums[i-1]*ans[i-1];
        }        
        int suffix = 1;
        for(int i=n-2; i>=0; i--) {
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};

        int ans[] = productExceptSelf(nums);
        for(int val: ans) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
