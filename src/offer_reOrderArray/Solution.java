package offer_reOrderArray;

public class Solution {

	// 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
	//所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。 
	public void reOrderArray(int[] array){
		for (int i = 1; i < array.length; i++) {
			int tmp = array[i];
			//如果有奇数,发现有奇数后，向前找偶数。发现偶数后，则将奇数于偶数调换位置
			if(tmp % 2 == 1){
				for (int j = i; j > 0; j--) {
					//如果有偶数
					if (array[j - 1] % 2 == 0) {
						int t = array[j];
						array[j] = array[j - 1];
						array[j - 1] = t;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
