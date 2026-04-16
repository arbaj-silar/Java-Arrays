public class M_0_ProductExceptSelf {
    public static int[] productExceptSelf(int nums[]) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i=0; i<n; i++) {
            ans[i] = 1;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i != j) {
                    ans[i] *= nums[j];
                }
            }
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
