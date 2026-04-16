public class J_ComputeXpowN {
    public static double xPowN(double x, int n) {
        if(x == 0) return 0.0;
        if(x == 1) return 1.0;
        if(n%2 == 0 && x == -1) return 1.0;
        if(n%2 == 1 && x == -1) return -1.0;
        if(n == 0) return 1.0;
        if(n<0) {
            x = 1/x;
            n = -n;
        }

        double ans = 1;
        while(n>0) {
            if(n%2 == 1) {
                ans *= x;
            }
            x *= x;
            n /= 2;
        }

        return ans;
    }
    public static void main(String[] args) {
        double ans = xPowN(2.99, 2);

        System.out.println("xPowN: "+ans);
    }
}
