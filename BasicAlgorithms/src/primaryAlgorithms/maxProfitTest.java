package primaryAlgorithms;
/**
 * 最大利润
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * @author lingyumin
 *
 */
public class maxProfitTest {
	
	public static int maxProfit(int[] prices) {
//        int profit = 0;
//        int minPrice = prices[0];
//        for(int i = 0;i<prices.length;i++){
//            if(prices[i]>minPrice){
//                profit += (prices[i]-minPrice);
//                minPrice = prices[i];
//            }else{
//                minPrice = prices[i];
//            }
//        }
//        return profit;
		int m = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) m += prices[i] - prices[i - 1];
        }
        return m;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,1};
		System.out.println(maxProfit(arr));
	}

}
