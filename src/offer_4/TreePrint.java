package offer_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class TreePrint {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
		public int[][] printTree(TreeNode root){
			
			LinkedList<TreeNode> queue = new LinkedList<>();
			//按照每一层一个数组进行储存
			ArrayList<Integer> arr = new ArrayList<>();
			ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
			
			TreeNode last = root;
			TreeNode nLast = null;
			TreeNode temp = null;
			
			queue.add(last);
			while (!queue.isEmpty()) {
				//从队列里面取出第一个数
				temp = queue.poll();
				arr.add(temp.val);
				if (temp.left != null) {
					//将左孩子放到队列里
					queue.add(temp.left);
					//之后吧nLast置于这里
					nLast = temp.left;
				} 
				
				if(temp.right != null){
					//将右孩子置于这里
					queue.add(temp.right);
					nLast = temp.right;
				}
				
				if (temp == last) {
					//将这列数组放到一个按层排列的数组里
					arrayList.add(arr);
					//创建一个新的数组
					arr = new ArrayList<>();
					
					last = nLast;
				}
			}
			
			//初始化int二维数组
			int[][] trees = new int[arrayList.size()][];
			//将整个数组里的 转化为inr[][]
			for (int i = 0; i < arrayList.size(); i++) {
				trees[i] = new int[arrayList.get(i).size()];
				for (int j = 0; j < arrayList.get(i).size(); j++) {
					trees[i][j] = arrayList.get(i).get(j);
				}
				
			}
			
			return trees;
		}
}
