package offer_44;

import java.util.ArrayList;
import java.util.Arrays;

import practice.ShellSort;

public class Solution {

	/**
	 * 从扑克牌中随机抽 5 张牌,判断是不是顺子,即这 5 张牌是不是连续的。
	 *  2-10 为数字本身,A 为 1,J 为 11,Q 为 12,K 为 13,而大小王可以看成任意的 数字。
	 * */
	public boolean isContinuous(int[] number){
		if (number == null) {
			return false;
		}
		//进行排序
		Arrays.sort(number);
		int zero = 0, i = 0;

		//搜索数组中含有0
		for(; i<number.length && number[i]==0; i++){
			zero++;				
		}
		
		//进行判断
		for (; i < number.length-1 && zero>=0; i++) {
			//有对子则报错
			if (number[i]==number[i+1]) 
				return false;
			//两者相差为1,其中大小王可以变任何数字
			if (number[i] + 1 + zero >= number[i+1]) {
				//zero -= number[i+1] - number[i] - 1;
			} 
			else
				return false;			
		}
		
		if (i == number.length - 1) 
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
        int[] A={5,2,2,3,0};
        Solution solution = new Solution();
        solution.isContinuous(A);
        //shellSort.shellSort(A, A.length);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        
        System.out.println(solution.isContinuous(A));
    }
	
}
