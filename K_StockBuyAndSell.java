public class K_StockBuyAndSell {
    public static int maxProfit(int price[]) {
        int bestBuy = price[0], maxPro = 0;
        for(int i=1; i<price.length; i++) {
            if(price[i] > bestBuy) {
                maxPro = Math.max(maxPro, price[i]-bestBuy);
            }

            bestBuy = Math.min(price[i], bestBuy);
        }

        return maxPro;
    }
    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Max Profit: "+maxProfit(price));
    }
}
