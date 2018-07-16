package primaryAlgorithms;

/**
 * 旋转数组 
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * @author lingyumin
 *
 */
public class RotateTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		rotate(arr, 2);
		for (int i : arr) {
			System.out.print(i);
		}

	}

	public static void rotate(int[] nums, int k) {
		k %= nums.length;
		// 倒置整个数组
		nums = reverse(nums, 0, nums.length - 1);
		// 倒置0到K-1
		nums = reverse(nums, 0, k - 1);
		// 倒置K到末尾
		nums = reverse(nums, k, nums.length - 1);
	}

	// 倒置数组
	private static int[] reverse(int[] arr, int begin, int end) {
		while (end > begin) {
			int tmp = arr[begin];
			arr[begin++] = arr[end];
			arr[end--] = tmp;
		}
		return arr;
	}
}
