package linkedlist;
import java.util.*;

public class RemoveDuplicates1 {
    
	class Node{
	    int data;
	    Node next;
	    Node(int x){
	    	data=x;
	    	next=null;
	    }
	}
	
    Node head;
	
	//At the front of the linked list
	public void push(int new_data){
		Node new_node = new Node(new_data); //create the new node
		new_node.next = head; //point the new node next to head
		head = new_node; //change the head to new node
	}
	
	public Node removeDuplicates(Node head)
	    {
		   List<Integer> seeValues= new ArrayList<Integer>();
		   Node curr=head;
		   Node temp;
		   while(curr.next!=null){
		       temp=curr;
		       curr=curr.next;
		       if((temp.data==curr.data)&&(curr.next!=null)){
		           curr=curr.next;
		       }
		   }
		   head=curr;
		   return head;
	    }
	 
	public void printList() {
	     Node printMe=head;
	     while(printMe!=null) {
	    	 System.out.println(printMe.data + " ");
	    	 printMe=printMe.next;
	     }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RemoveDuplicates1 rd = new RemoveDuplicates1();
        rd.push(5);
        rd.push(4);
        rd.push(2);
        rd.push(2);
        rd.removeDuplicates(rd.head);
        rd.printList();
	}

}
