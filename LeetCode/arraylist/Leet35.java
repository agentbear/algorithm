/**
 * Created by Administrator on 2018/4/26.
 */
public class Leet35 {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
