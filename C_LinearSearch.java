public class C_LinearSearch {    

    public static int linearSearch(int arr[], int tar) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == tar) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-1, 0, 4, 2, 6, 9, -3, 7};

        System.out.println("Value Idx: " + linearSearch(arr, -3));
    }
}