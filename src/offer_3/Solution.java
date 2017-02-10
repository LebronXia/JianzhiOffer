package offer_3;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	//输入一个链表，从尾到头打印链表每个节点的值。 
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		Stack<Integer> stack = new Stack<>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		} 
		while (!stack.isEmpty()) {
			arrayList.add(stack.pop());
		}
			
		return arrayList;
	}
	
	public static class ListNode{
		int val;
		ListNode next = null;
		
		public ListNode(int val) {
			this.val = val;
		}
	}
}
