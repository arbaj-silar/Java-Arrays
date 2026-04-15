public class A_Smallest {
    
    public static int getSmallestValue(int arr[]) {
        int small = Integer.MAX_VALUE;

        for(int val: arr) {
            if(small > val) {
                small = val;
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[] = {5, 15, 22, 1, -15, -24};

        System.out.println("Smallest value: "+getSmallestValue(arr));
    }
}