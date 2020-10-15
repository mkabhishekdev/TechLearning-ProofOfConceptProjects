package linkedlist;


public class DoublyLinkedListImpl2 {
 
	Node head;
	
    class Node{
	  int data;
	  Node next;
	  Node prev;
	  Node(int x){
		data=x;
		prev=null;
		next=null;
	 }
   }


    public void InsertAtBegin(int data){
    	Node beginNode = new Node(data);
    	
    }
    
	public void InsertAtEnd(int data){
	   Node endNode = new Node(data);
	   if(head ==  null) head = endNode;
	   Node curr=head;
	   while(curr.next!=null){
		   curr=curr.next;
	   }
	   curr.next=endNode;
	   endNode.next=null;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         DoublyLinkedListImpl2 dll2 = new DoublyLinkedListImpl2();
         dll2.InsertAtEnd(5);
         dll2.InsertAtBegin(1);
         dll2.InsertAtBegin(2);
         dll2.InsertAtBegin(3);
         dll2.InsertAtBegin(4);
	}

}
