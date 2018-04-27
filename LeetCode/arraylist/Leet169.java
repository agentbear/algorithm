import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/27.
 */
public class Leet169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        // for(int i=0; i<nums.length; i++){
        //     if(res.size() == 0){
        //         res.put(nums[i], 1);
        //         continue;
        //     }
        //     if(!res.containsKey(nums[i])){
        //         int key = (int)res.keySet().toArray()[0];
        //         res.put(key, res.get(key) - 1);
        //         if(res.get(key) == 0){
        //             res.remove(key);
        //         }
        //         continue;
        //     }
        //     res.put(nums[i], res.get(nums[i]) + 1);
        // }
        // return (int)res.keySet().toArray()[0];
        for(int i=0; i<nums.length; i++){
            if(!res.containsKey(nums[i])){
                res.put(nums[i], 1);
            }
            else{
                res.put(nums[i], res.get(nums[i]) + 1);
            }
        }
        for(Integer i: res.keySet()){
            if(res.get(i) > nums.length / 2){
                return i;
            }
        }
        return -1;
    }
}
