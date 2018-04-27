import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/27.
 */
//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

public class Leet118 {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(numRows <= 0){
            return ans;
        }
        ans.add(first);
        for(int i=1; i<numRows; i++){
            List<Integer> tmp = new ArrayList<Integer>();
            for(int j=0; j<i+1; j++){
                if(j == 0 || j == i){
                    tmp.add(1);
                }
                else{
                    int val = ans.get(i - 1).get(j-1) + ans.get(i-1).get(j);
                    tmp.add(val);
                }
            }
            ans.add(tmp);
        }
        return ans;
    }
}
