/**
 * Created by Administrator on 2018/4/27.
 */
public class Leet121 {
    public int process(int index, int[] prices){
        if(index < 0){
            return 0;
        }
        int ans = 0;
        for(int i = index; i >= 0; i--){
            ans = Math.max(prices[index] - prices[i], ans);
        }
        return Math.max(ans, process(index - 1, prices));
    }

    public int maxProfit(int[] prices) {
        return process(prices.length - 1, prices);

    }
}
