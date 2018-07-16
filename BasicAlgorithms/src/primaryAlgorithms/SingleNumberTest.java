package primaryAlgorithms;
/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @author lingyumin
 *
 */
public class SingleNumberTest {
	public static int singleNumber(int[] nums) {
        //先排序
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i+=2){
    //         if(nums[i] != nums[i+1]){
    //             return nums[i];
    //         }
    //     }
    //     return nums[nums.length-1];
    // }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];//不知咋回事
            System.out.print(result);
        }
        System.out.println();
        return result;
	}
	public static void main(String[] args) {
		int[] arr = {2,2,3,3,3,4};
		System.out.println(singleNumber(arr));
	}
}
