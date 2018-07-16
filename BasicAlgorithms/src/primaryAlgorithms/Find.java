package primaryAlgorithms;
import java.util.Scanner;

public class Find {
	/**
	 * 二分查找法
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int findKey(int[] arr, int key) {
		int low = 0;// 数组第一个数索引
		int high = arr.length - 1;// 数组最后一个数索引
		int mid = 0;// 中间数索引

		if (key < arr[low] || key > arr[high]) {
			return -1;
		}

		while (low <= high) {
			mid = (low + high) / 2;
			if (key < arr[mid]) {
				high = mid - 1;
			} else if (key > arr[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		Scanner s = new Scanner(System.in);
		int key=0;
		while(true) {
			key = s.nextInt();
			System.out.println(findKey(arr,key));
		}
	}
}
