package primaryAlgorithms;
import java.util.Calendar;

public class Sort {
	/**
	 * 冒泡排序
	 * 外循环控制冒泡次数 length-1次
	 * 内循环控制数组相邻数逐个比较 随着冒泡次数递增 内循环的逐个比较次数逐渐减少
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort(int[] arr) {

		int[] array = arr;

//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println();
//		for (int i : array) {
//			System.out.print(i + " ");
//		}
		return array;
	}

	/**
	 * 选择排序
	 * 外循坏控制比较次数 length-1次 且设置索引为i的值为当前最小值
	 * 内循环控制 索引为J的数逐个 和最小值比较 小则替换
	 * @param arr
	 */
	public static int[] selectionSort(int[] arr) {

//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		System.out.println();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		return arr;
	}

	public static void main(String[] args) {
//		int[] arr = { 10, 9, 6 };
//		selectionSort(arr);
		int[] arr = new int[10000];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10000);
			System.out.println(arr[i]);
		}
		
		Calendar c = Calendar.getInstance();
		long q = c.getTimeInMillis();
		System.out.println("冒泡排序执行前："+q);
		bubbleSort(arr);
		Calendar c1 = Calendar.getInstance();
		long h = c1.getTimeInMillis();
		System.out.println("冒泡排序执行后："+h);
		System.out.println(h-q);
		
		Calendar c2 = Calendar.getInstance();
		long q1 = c2.getTimeInMillis();
		System.out.println("选择排序执行前："+q1);
		selectionSort(arr);
		Calendar c3 = Calendar.getInstance();
		long h1 = c3.getTimeInMillis();
		System.out.println("选择排序执行后："+h1);
		System.out.println(h1-q1);
	}
}
