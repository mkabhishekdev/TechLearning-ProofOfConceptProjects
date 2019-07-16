package linkedlist;

public class SinglyLinkedListImpl {

	Node head; /* head of the list */
	
	class Node{
	    int data;
	    Node next;
	    Node(int x){
	    	data=x;
	    	next=null;
	    }
	}
	
	//At the front of the linked list
	public void push(int new_data){
		Node new_node = new Node(new_data); //create the new node
		new_node.next = head; //point the new node next to head
		head = new_node; //change the head to new node
	}
	
	//After a given node
	public void insertAfter(Node prev_node,int new_data){
	   if(prev_node == null){
		   System.out.println("Previous node cannot be null");
		   return;
	   }
	   Node new_node = new Node(new_data);
       new_node.next = prev_node.next; //to point the previous to next value
       prev_node.next = new_node; //previous node will point to new node after the insertion
	}
	
	//At the end of the linked list
	public void append(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head=new Node(new_data);
			return;
		}
		new_node.next=null; //new node has to be the last node
		Node last=head; // creating a node named last to iterate over the list to get the last element
		while(last.next!=null){
			last=last.next;
		}
		last.next = new_node; //after iteration when we get the last node that will point next to the new node
	}

	//delete node from linked list
	public void deleteNode(int delete_data){
	      Node temp=head,prev=null;
	      
	      while(temp.next!=null && temp.data!=delete_data){
	    	  prev=temp;
	    	  temp=temp.next;
		}
	      prev.next = temp.next;
		
	}
	
	//delete node from linked list given its position
	public void deleteAtPosition(int position){
	      Node temp=head;
	      
	      for(int i=0;i<position-1;i++){
	    	  temp=temp.next;
	      }
	      Node jumpPoint = temp.next.next;
	      temp.next = jumpPoint;
	}
	
	//search an element in a linked list
	
	
	
	
	// reverse a linked list
	
	
	
	//print a linked list
	public void printList(){
		Node printMe  = head;
		while(printMe!=null){
			System.out.println(printMe.data+" ");
			printMe = printMe.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SinglyLinkedListImpl ll = new SinglyLinkedListImpl();
          ll.append(6);
          ll.push(7);
          ll.push(1);
          ll.append(4);
          ll.insertAfter(ll.head.next, 8);
          System.out.println("Created Linked List:\n ");
        //  ll.deleteNode(7);
          ll.printList();
	}

}
