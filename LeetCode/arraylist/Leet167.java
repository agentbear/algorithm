/**
 * Created by Administrator on 2018/4/27.
 */
public class Leet167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int i=0; i<numbers.length; i++){
            int tmp = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[j] + tmp == target){
                    ans[0] = i + 1;
                    ans[1] = j + 1;
                    return ans;
                }
                if(numbers[j] + tmp > target){
                    break;
                }
            }
        }
        return ans;
    }
}
