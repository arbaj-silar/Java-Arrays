import java.util.Arrays;

public class U_AggressiveCows {

    public static boolean isPossible(int arr[], int n, int c, int minAllowedDist) {
        int cows = 1, lastStallPos = arr[0];

        for(int i=0; i<n; i++) {
            if(arr[i]-lastStallPos >= minAllowedDist) {
                cows++;
                lastStallPos = arr[i];
            }

            if(cows == c) {
                return true;
            }
        }

        return false;
    }

    public static int getDistance(int arr[], int n, int c) {
        Arrays.sort(arr);
        int st = arr[0], end = arr[n-1]-arr[0];
        int ans = -1;

        while(st <= end) {
            int mid = st + (end-st)/2;

            if(isPossible(arr, n, c, mid)) {
                ans = mid;
                st = mid+1;
            } else {
                end = mid-1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 2, 8, 9};
        int n = 6, c = 3;

        System.out.println("Minimum distance: "+getDistance(arr, n, c));
    }
}
