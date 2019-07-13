package linkedLists;
import java.util.*;

public class ReverseLinkedList {
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	 public ListNode reverseList(ListNode head) {
	       ListNode prev=null;
	       ListNode curr=head;
	       ListNode next=null;
	       
	       while(curr!=null){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              next=curr;
	       }
		 return prev;

	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ReverseLinkedList rll = new ReverseLinkedList();
        LinkedList ll = new LinkedList();
        
	}

}

