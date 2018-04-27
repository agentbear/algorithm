/**
 * Created by Administrator on 2018/4/26.
 */
public class Leet27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val)
                count++;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                if(nums.length == 1){
                    return 0;
                }
                for(int j=i; j<nums.length; j++){
                    if(nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
