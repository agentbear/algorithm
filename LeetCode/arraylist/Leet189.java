/**
 * Created by Administrator on 2018/4/27.
 */
public class Leet189 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int cur = nums.length - k;
        nums = reverse(nums, 0, cur-1);
        nums = reverse(nums, cur, nums.length-1);
        nums = reverse(nums, 0, nums.length-1);

    }
    public int[] reverse(int[] nums, int s, int e){
        int len = e-s+1;
        for(int i=0; i<len/2; i++){
            int tmp = nums[s+i];
            nums[s+i] = nums[e-i];
            nums[e-i] = tmp;
        }
        return nums;
    }
}
