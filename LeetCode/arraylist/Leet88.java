/**
 * Created by Administrator on 2018/4/27.
 */

//给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//说明:
//初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

public class Leet88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j < m + n; j++){
                if(nums1[j] > nums2[i]){
                    nums1 = insert(nums1, m, n, j, nums2[i]);
                    break;
                }
                if(j == m + i){
                    nums1 = insert(nums1, m, n, j, nums2[i]);
                    break;
                }
            }
        }
        // nums1 = insert(nums1, m, n, 5, 5);
    }
    public int[] insert(int[] nums, int m, int n, int loc, int val){
        for(int i= m + n - 1; i>loc; i--){
            nums[i] = nums[i - 1];
        }
        nums[loc] = val;
        return nums;
    }
}
