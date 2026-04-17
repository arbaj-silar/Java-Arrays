public class O_ReccursiveApproach {
    public static int binarySearch(int nums[], int tar, int st, int end) {
        while(st <= end) {
            int mid = st + (end-st)/2;

            if(tar == nums[mid]) {
                return mid;
            } else if(tar > nums[mid]) {
                return binarySearch(nums, tar, mid+1, end);
            } else {
                return binarySearch(nums, tar, st, mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {-3, 0, 1, 4, 7, 9, 12};

        System.out.println("Value idx: "+binarySearch(nums, 12, 0, nums.length-1));
    }
}