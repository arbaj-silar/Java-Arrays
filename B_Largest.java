public class B_Largest {

    public static int getLargestValue(int arr[]) {
        int larg = Integer.MIN_VALUE;

        for(int val: arr) {
            if(larg < val) {
                larg = val;
            }
        }
        return larg;
    }
    public static void main(String[] args) {
        int arr[] = {-3, 0, 9, 2, 5, 1, 6};

        System.out.println("Largest value: "+getLargestValue(arr));
    }   
}
