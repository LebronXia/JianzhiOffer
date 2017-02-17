package offer_mimNumberInRotate;

public class Solution {

	//输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
	public static int minNumberInRotateArray(int[] array){
		int low=0; int high = array.length - 1;
		int middle;
		while (high > low) {
			middle = low + (high - low)/2;
			if (array[high] < array[middle]) {
				low = middle + 1;
			} else if(array[high] == array[middle]){
				high = high - 1;
			} else {
				high = middle;
			}			
		}
		return array[low];
	}
	
	public static void main(String[] args) {
		int[] array = {3,4,5,1,2};
		System.out.println(Solution.minNumberInRotateArray(array));

	}

}
