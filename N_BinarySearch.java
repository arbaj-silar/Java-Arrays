public class N_BinarySearch {
    public static int binarySearch(int nums[], int tar) {
        int st = 0, end = nums.length-1;

        while(st <= end) {
            int mid = st + (end-st)/2;

            if(tar == nums[mid]) {
                return mid;
            } else if(tar > nums[mid]) {
                st = mid+1;
            } else {
                end = mid -1;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int nums[] = {-3, 0, 1, 4, 7, 9, 12};

        System.out.println("Value idx: "+binarySearch(nums, 9));
    }
}
