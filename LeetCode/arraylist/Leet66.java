/**
 * Created by Administrator on 2018/4/26.
 */
public class Leet66 {
    public int[] plusOne(int[] digits) {
        boolean flag = true;
        for(int i=digits.length-1; i>=0; i--){
            if(flag)
                digits[i]++;
            if(digits[i] == 10){
                digits[i] = 0;
                continue;
            }
            else{
                flag = false;
            }
            break;
        }
        if(flag){
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            for(int i=1; i<digits.length; i++){
                ans[i] = digits[i-1];
            }
            return ans;
        }
        else
            return digits;
    }
}
