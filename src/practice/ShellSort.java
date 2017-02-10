package practice;

public class ShellSort {

	public int[] shellSort(int[] A, int n){
		//i为第二个所处的位置
		int i,j,temp = 0;
		int increment=A.length;
		while(increment > 1){
			increment = increment/3 + 1;
			for(i = increment; i < n; i++){
				//有一个增量，对这个进行比较
				if (A[i] < A[i-increment]) {
					//将较小的数置于temp缓存
					temp = A[i];
					
					for (j = i-increment; j >= 0 && temp < A[j] ; j-=increment) 
						//循环的目的  是将大的数填入相应的位置
						//符合条件，则循环
						A[j + increment] = A[j];
					
						A[j + increment] = temp;				
					}
				}
			}
		return A;
	}
	
	 public static void main(String[] args) {
	        int[] A={54,35,48,36,27,12,44,44,8,14,26,17,28};
	        ShellSort shellSort = new ShellSort();
	        shellSort.shellSort(A, A.length);
	        for (int i = 0; i < A.length; i++) {
	            System.out.println(A[i]);
	        }
	    }
}
