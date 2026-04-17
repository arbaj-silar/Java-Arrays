public class Q_MountainArray {
    public static int topIdx(int nums[]) {
        int st = 1, end = nums.length-2; 

        while(st <= end) {
            int mid = st + (end-st)/2;

            if(nums[mid] > nums[mid+1] && nums[mid] >= nums[mid-1]) {
                return nums[mid];
            }
            if(nums[mid] > nums[mid-1]) {
                st = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {0, 3, 5, 8, 9, 1, 2};

        System.out.println("Mountain Top: "+topIdx(nums));
    }
}
