package primaryAlgorithms;
/**
 * 给定一个整数数组，判断是否存在重复元素
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * @author lingyumin
 *
 */
public class ContainsDuplicateTest {
	public static boolean containsDuplicate(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		
	}
}
