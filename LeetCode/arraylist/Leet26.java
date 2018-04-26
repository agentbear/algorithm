import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/26.
 */
public class Leet26 {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums.length == 0){
            return 0;
        }
        list.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
