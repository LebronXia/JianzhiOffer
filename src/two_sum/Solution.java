package two_sum;

import java.util.HashMap;

public class Solution {

	//给定一个整数数组，找到2个数字，这样他们就可以添加到一个特定的目标号。
	//功能twosum应该返回两个数字，他们总计达目标数，其中index1必须小于index2。
	//请注意，你的答案返回（包括指数和指数）不为零的基础。你可以假设每个输入都有一个解决方案。
	public static int[] twoSum(int[] numbers, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		//思路;先目标数字减去整数数组中随机一个数，然后利用得到的数在余下的数字中寻找，匹配到后，就可以得到答案中的两个数
		for(int i = 0; i < numbers.length; i++){		
			if (map.get(numbers[i]) != null) {
				
				int[] result = {map.get(numbers[i]) + 1, i + 1};
				return result;
			} else {
				//将减去的数得到后，在匹配中寻找
				map.put(target - numbers[i], i);
			}
		}
		
		
		return null;
	}
	
	public static void main(String[] args) {
		int[] numbers = { 2,7,11,15 };
		int[] result = Solution.twoSum(numbers, 9);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
