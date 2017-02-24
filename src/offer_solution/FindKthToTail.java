package offer_solution;

public class FindKthToTail {

	//输入一个链表，输出该链表中倒数第k个结点。
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode FindKthToTail(ListNode head, int k){
		if (head == null || k <= 0) {
			return null;
		}
		ListNode pre = head;
		ListNode last = head;
		
		//先将第一个指针走K-1步，到达k个节点.
		//判断是不是K超过链表的长度
		for (int i = 1; i < k; i++) {
			if (pre.next != null) {
				pre = pre.next;
			} else {
				return null;
			}		
		} 
		
		//因为两个指针相差k,所以第一个指针到达终点后，第二个指针就为倒数第k个节点
		while(pre.next != null){
			pre = pre.next;
			last = last.next;
		}
		return last;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
