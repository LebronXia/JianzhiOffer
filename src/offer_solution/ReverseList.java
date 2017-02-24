package offer_solution;

public class ReverseList {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode ReverseList(ListNode head){
		ListNode pre = null;
		ListNode next = null;
		
		while (head != null) {
			//next指向下一个节点,保存信息
			next = head.next;
			//让head指向上个节点
			head.next = pre;
			
			pre = head;
			head = next;
						
		}
		return pre;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
