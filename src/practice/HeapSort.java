package practice;

public class HeapSort {

	public int[] heapSot(int[] A, int n){
		int i;
		//先对顺序表进行对排序，构建一个大顶堆
		//从4开始，是将每个非终端节点当做根节点
		for(i=n/2; i>=0; i--){
			//构建大顶堆
			HeadpAdjust(A, i, n);
		}
		
		for(i=n-1;i>0;i--){
			//将第一位和最后一位互换位置
			swap(A, 0, i);
			HeadpAdjust(A, 0, i);			
		}
		return A;
	}
	
	//进行堆排序
    void HeadpAdjust(int[] arr, int s, int m){
    	int temp,j;
    	//取关键字
    	temp = arr[s];
    	//取左节点，依次向下筛选
    	for(j = 2*s + 1; j < m; j=2*j + 1){
    		//取左右节点最大值
    		if(j < m - 1 && arr[j] < arr[j+1])
    			j++;
    		System.out.println(j + "j的数字");
    		//如果关键字大于选取出来的最大值，则借宿循环
    		if(temp > arr[j]){
    			break;
    		}
    		
    		arr[s] = arr[j];
    		//关键字到了j这个位置
    		s = j;
    	}
    	//将关键字插入空出的位置
    	arr[s] = temp;
    }
    
    static void swap(int[] arr, int m, int n){
    	int temp = arr[m];
    	arr[m] = arr[n];
    	arr[n] = temp;
    }
    
    public static void main(String[] args) {
        int[] A={1,2,3,5,2,3};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSot(A, A.length);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
