package twoDArray;

public class ArrayStock {
    public static int buySellStock(int []prices){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i =0;i<prices.length;i++){
            if(buyPrice < prices[i]){ //tha will check we are profit or not if we are proft then if condition will return true
                int profit =prices[i]-buyPrice;   // here we calculate profit of the day
                maxProfit=Math.max(maxProfit,prices[i]);  // here we calculate profit max day till
            }else {
                buyPrice=prices[i];     // here we update the value of buy prices because
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] prices ={7,1,5,3,6,4};
        System.out.println(buySellStock(prices));
    }
}
