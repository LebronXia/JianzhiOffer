package Offer_LastRemaining;

import java.util.ArrayList;

public class Solution {

	public static int LastRemaining_solution(int n, int m){
		
		if (n < 0 || m < 0 ) {
			return -1;
		}
		//建立存放小孩的数组
		int[] arr = new int[n];
		int i = -1, step = 0;
		//跳出循环的条件
		int count = n;
		
		while(count > 0){  //剩余的数量小于0的时候退出循环
			System.out.println(i + "qian");
			++i;  //每次指向下一个元素，孩子的下标
			System.out.println(i + "hou");
			if (i >=n) i=0;   //模拟环形
			if (arr[i] == -1) continue;  //跳过被删除的那位
			
			step++;  //记录步数
			if (step == m) {
				arr[i] = -1;
				step = 0;  //步数复位
				count--;  //出去一个小孩则减少一位
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
//		int[] A={5,2,2,3,0};
//        Solution solution = new Solution();
//        solution.isContinuous(A);
//        //shellSort.shellSort(A, A.length);
//        for (int i = 0; i < A.length; i++) {
//            System.out.println(A[i]);
//        }
		
		System.out.println(Solution.LastRemaining_solution(4, 2));


	}

}
