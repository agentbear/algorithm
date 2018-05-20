import java.lang.reflect.Array;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class MaxGap {
    //思路1：排序后寻找最大间隔，排序复杂度O(nlogn)，遍历最大间隔O(n)，综合O(nlogn)
    //思路2：利用桶排序思想，对于大小为N的数组，开辟N+1个桶，把max放在第N+1号桶中，其余N-1个数
    //放在N个桶中，其中必有一个空桶。每个桶负责的区域大小为(max - min)/N
    //最大间隔的相邻数一定在不同的桶中。
    //因此只需保存每个桶中的max和min，最大差值来自于某非空桶的最小值-上一个非空桶的最大值。
    public static int maxGap(int[] nums){
        if(nums == null || nums.length < 2){
            return 0;
        }
        Map<Integer, ArrayList> map = new HashMap<Integer, ArrayList>();
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<len; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        if(min == max){
            return 0;
        }

        boolean[] bucket = new boolean[len + 1];
        int[] maxs = new int[len + 1];
        int[] mins = new int[len + 1];
        int bid = 0;
        for(int i=0; i<len; i++){
            bid = countBucket(nums[i], len, min, max);
            mins[bid] = bucket[bid] ? Math.min(mins[bid], nums[i]) : nums[i];
            maxs[bid] = bucket[bid] ? Math.max(maxs[bid], nums[i]) : nums[i];
            bucket[bid] = true;
        }

        int ans = 0;
        int lastMax = 0;
        int i = 0;
        while(i <= len){
            if(bucket[i++]){
                lastMax = maxs[i - 1];
                break;
            }
        }
        for(i=0; i<= len; i++){
            if(bucket[i]){
                ans = Math.max(ans, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return ans;
    }

    public static int countBucket(int num, int len, int max, int min){
        return ((num - min) * len / (max - min));
    }

    public static void main(String[] args){
        int[] nums = {6,4,5,3,2,1,7,10,9};
        MaxGap mg = new MaxGap();
        int ans = MaxGap.maxGap(nums);
        System.out.println(ans);
    }
}
