package twoDArray;

public class Stock {
    public static void main(String[] args) {
        int prices[]={7,6,4,3,1};
        System.out.println(StockProfit(prices));
    }
    public static int StockProfit(int[]prices){
        int buyPrices=prices[0];
        int profit=0;

        for(int i =1; i<prices.length;i++){
            if(buyPrices<prices[i]){
                profit=Math.max(prices[i]-buyPrices,profit);

            }else{
                buyPrices =prices[i];

            }
        }return profit;
    }
}
