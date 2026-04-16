public class M_1_ProductExceptSelf {
    public static int[] productExceptSelf(int nums[]) {
        int n = nums.length;
        int ans[] = new int[n];
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        for(int i=0; i<n; i++) {
            ans[i] = 1;
            prefix[i] = 1;
            suffix[i] = 1;
        }

        for(int i=1; i<n; i++) {
            prefix[i] = nums[i-1]*prefix[i-1];
        }        

        for(int i=n-2; i>=0; i--) {
            suffix[i] = suffix[i+1]*nums[i+1];
        }

        for(int i=0; i<n; i++) {
            ans[i] = prefix[i]*suffix[i];
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