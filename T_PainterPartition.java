public class T_PainterPartition {

    public static boolean isPossible(int arr[], int n, int m, int maxAllowedTime) {
        int painter = 1, time = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] > maxAllowedTime) {
                return false;
            }

            if(arr[i]+time <= maxAllowedTime) {
                time += arr[i];
            } else {
                painter++;
                time = arr[i];
            }
        }

        return painter <= m;
    }

    public static int minTimeToPaint(int arr[], int n, int m) {
        int maxVal = Integer.MIN_VALUE, sum = 0;

        for(int val: arr) {
            sum += val;
            maxVal = Math.max(maxVal, val);
        }

        int st = maxVal, end = sum;
        int ans = -1;

        while(st <= end) {
            int mid = st + (end-st)/2;

            if(isPossible(arr, n, m, mid)) {
                ans = mid;
                end = mid -1;
            } else {
                st = mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {40, 30, 10, 20};
        int n = 4, m = 2;

        System.out.println("Min time: "+minTimeToPaint(arr, n, m));
    }
}
