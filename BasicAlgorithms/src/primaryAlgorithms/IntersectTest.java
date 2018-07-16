package primaryAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IntersectTest {
	public static int[] intersect(int[] nums1, int[] nums2) {

		// 存放nums1 数字出现次数
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// 存放集合结果
		List<Integer> result = new ArrayList<Integer>();

		if (nums1.length == 1 || nums2.length == 1) {
			return null;
		}

		// 遍历nums1 存放在map中 key存数字 value存出现次数
		for (Integer i : nums1) {
			// 如果map中不存在nums1[i] 第一次出现该字数 存在则+1
			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}

//		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
//		for (Entry<Integer, Integer> entry : entrySet) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}

		// 遍历nums2 与map中key值对比 如果map存在key
		// 向result中添加该key 并且map中key对应value>1时-1 否则map中remove这个key
		for (int i = 0; i < nums2.length; i++) {
			if (map.get(nums2[i]) != null) {
				
				// 向result中添加 该key
				result.add(nums2[i]);
				
				if (map.get(nums2[i]) > 1) {
					map.put(nums2[i], map.get(nums2[i]) - 1);
				} else {
					map.remove(nums2[i]);
				}
				
			}
		}

		int[] arrR = new int[result.size()];
//		System.out.println(result.size());
		for (int i=0;i<arrR.length ;i++) {
			arrR[i] = result.get(i);
		}
		return arrR;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 2,3 };
		int[] nums2 = { 2, 2 ,2,3};
		for (int i : intersect(nums1, nums2)) {
			System.out.print(i+" ");
		}
	}
}
