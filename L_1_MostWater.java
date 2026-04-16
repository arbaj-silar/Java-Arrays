public class L_1_MostWater {
    public static int maxArea(int height[]) {
        int maxWater = 0;
        int st = 0, end = height.length-1;
        
        while(st < end) {
            int wd = end-st;
            int ht = Math.min(height[st], height[end]);
            int area = ht*wd;
            maxWater = Math.max(maxWater, area);

            if(height[st] > height[end]) {
                end--;
            } else {
                st++;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max water filled: "+maxArea(height));
    }
}
