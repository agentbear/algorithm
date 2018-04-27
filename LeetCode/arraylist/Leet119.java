import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/27.
 */
//线性时间求杨辉三角
//本质是求Cm^n的值

public class Leet119 {
    public int cmn(int m, int n){
        long first = 1;
        if(n != m / 2)
            n = Math.min(n, m-n);
        for(int i=0; i<n; i++){
            first *= m-i;
            first /= i+1;
        }
        return (int)first;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<rowIndex + 1; i++){
            ans.add(cmn(rowIndex, i));
        }
        return ans;
    }
}
