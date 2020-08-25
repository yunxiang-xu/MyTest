package com.test.basic;

public class linkTest {
	
	class ListNode {
		public ListNode next;
		public String data;
		
		/*public ListNode(String string) {
			data = string ;
		}*/

		ListNode ListNode(String a ) {
			data = a ;
			next = new ListNode();
			return next;
		}
		
		public void print(ListNode node) {
			if(node.next==null) {
				if(node.data !=null) {
					System.out.println(node.data);
				}
				return;
			}
			if(node.data ==null) {
				print(node.next);
			}else {
				//System.out.println(node.data);
				System.out.println(node.data);
				print(node.next);
			}
			
		}
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode next = head.next;
		ListNode new_head = reverseList(next);
		if(new_head.equals(next) ) {
			System.out.println("地址相同");
		}
		
		next.next = head;
		head.next = null;
		return new_head;
	}
	
	public static void main(String[] args) throws InterruptedException {
		linkTest test = new linkTest();
		ListNode node = test.new ListNode();
		/*ListNode node1 = test.new ListNode("2");
		ListNode node2 = test.new ListNode("3");
		ListNode node3 = test.new ListNode("4");
		node.next = node1;
		node1.next = node2;
		node2.next = node3;
		node.print(node);
		
		ListNode newCode = test.reverseList(node);
		newCode.print(newCode);*/
		node.ListNode("1").ListNode("2").ListNode("3");
		node.print(node);
		
		ListNode newCode = test.reverseList(node);
		newCode.print(newCode);
	}
}
