public class R_SingleElement {
    public static int singleNonDuplex(int nums[]) {
        int n = nums.length;
        int st = 0, end = n-1;

        while(st <= end) {
            int mid = st + (end-st)/2;

            if(mid == 0 && nums[mid] != nums[mid+1]) {
                return nums[mid];
            }
            if(mid == n-1 && nums[mid] != nums[mid-1]) {
                return nums[mid];
            }
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) {
                return nums[mid];
            }
            if(mid%2 == 0) {
                if(nums[mid] != nums[mid-1]) {
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                if(nums[mid] != nums[mid-1]) {
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 3, 7, 7, 9, 11, 11};
        System.out.println("Non Duplex: "+singleNonDuplex(nums));
    }
}
