package niuke_4;

public class BubbleSort {
	public int[] bubbleSort(int[] A, int n){
		int i,j,temp = 0; 
		for(i = 0; i < n - 1; i++){
			for(j = 0; j < n - i - 1; j++){
				if(A[j] > A[j + 1]){
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}	
		return A;	
	}
}
