public class P_RotatedArray {
    public static int rotatedSortedArray(int nums[], int tar) {
        int st = 0, end = nums.length-1;

        while(st <= end) {
            int mid = st + (end-st)/2;

            if(nums[mid] == tar) {
                return mid;
            }
            if(nums[st] <= nums[mid]) {
                if(nums[st]<= tar && nums[mid] >= tar) {
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            } else {
                if(nums[mid] <= tar && nums[end] >= tar) {
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4, 7, 9, 12, -3, 0, 1, 3};
        System.out.println("Rotated Array: "+rotatedSortedArray(nums, 7));
    }
}