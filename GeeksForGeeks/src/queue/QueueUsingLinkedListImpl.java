package queue;


public class QueueUsingLinkedListImpl {
    
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
	
	//insert element into queue
	public void add(int element){
		Node new_node = new Node(element);
	    Node curr=head;
	    if(curr==null){
	    	head=new_node;
	    	return;
	    }
	    while(curr!=null){
	    	curr=curr.next;
	    }
	    curr= new_node;
	    new_node.next=null;
	}
	
	//display front element in a queue
	public int peek(){
		Node curr=head;
		Node temp=null;
		while(curr!=null){
			temp=curr;
			curr=curr.next;
		}
		return temp.data;
	}
	
	//print a linked list
		public void printList(){
			Node printMe  = head;
			while(printMe!=null){
				System.out.println(printMe.data+" ");
				printMe = printMe.next;
			}
		}
		
	/* Implement queue using linked list data structure */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        QueueUsingLinkedListImpl queue = new QueueUsingLinkedListImpl();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.printList();
	}

}
