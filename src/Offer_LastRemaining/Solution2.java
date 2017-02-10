package Offer_LastRemaining;

public class Solution2 {

	public static int LasrRemaining_Solution(int n, int m){
		//n代表总人数，  m代表指定任意一个数
		
		//设三个变量，i为每个小孩的下标， count为剩下的人数，arr为小孩的存放数组
		int i = 0, step = 1;
		int count = n; //跳出循环的条件
		int[] arr = new int[n];
		
		while(count > 0){
			i++;   //孩子的下标
			
			if (i >= n) {
				i = 0;
			}
			step++;  //步数统计
			if(arr[i] == -1) continue;  //当被标记位-1；孩子已被去除，跳过
			
			if (step == m) {
				arr[i] = -1;
				count--;
				step = 0;
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		System.out.println(Solution2.LasrRemaining_Solution(10, 5));

	}
}
