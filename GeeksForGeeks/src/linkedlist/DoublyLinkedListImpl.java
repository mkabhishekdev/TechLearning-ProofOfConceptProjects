package linkedlist;

public class DoublyLinkedListImpl {

	Node head;
	//Create node
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int x){
			data=x;
			prev=null;
			next=null;
		}
	}
	
	//Insert at front of dll
	public void push(int new_data){
        Node new_node = new Node(new_data); //create new node
		
        /* pointing the new_node next to present head & prev to null*/
		new_node.next=head;
		new_node.prev=null;
		
		if(head!=null)head.prev=new_node; 	//point the head previous to new node 
		 
		head=new_node; //make the new node the present head 
	}
	
	
	//Insert after a given node in dll
	public void insertAfter(Node prev_node,int new_data){
		Node new_node=new Node(new_data); //created new node
		
		/* set the new node */
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		
		new_node.prev=prev_node; //point previous of new node to previous(1st step: different from singly linked list)
		
		if(new_node.next!=null){
			new_node.next.prev=new_node; //point of previous of new nodes next node to present new node(2nd step: different from singly linked list)
		}
	}
	
	//At the end of dll
	public void append(int new_data){
		Node new_node = new Node(new_data);
		Node last=head;
		
		/* if dll not empty traverse till last node */
		while(last!=null){
			last=last.next;
		}
		
		/* if dll empty */
		if(head==null){
			new_node.prev=null;
			head=new_node;
			return;
		}
		
		new_node.prev=last;
		new_node.next=null;
	}
	
	//add a node before a given node
	public void insertBefore(Node given_node,int new_data){
	   Node new_node=new Node(new_data);
	   new_node.prev = given_node.prev;
	   given_node.prev = new_node;
	   new_node.next = given_node;
	}
	
	void addNodeGeeks(Node head_ref, int pos, int data)
	{
	    Node new_node = new Node(data);
		Node curr=head_ref;
		int count=0;
		while(curr!=null && count!=pos){
		    curr=curr.next;
		    count++;
		}
		Node temp=curr.next;
	    curr.next = new_node;
	    new_node.next=temp;
	   
	}
	
    // This function prints contents of linked list starting from the given node 
    public void printlist(Node node) 
    { 
        Node last = null; 
        System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node;   //storing the last node occurrence in the last variable helps performing reverse operation 
            node = node.next; 
        } 
        System.out.println(); 
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.print(last.data + " "); 
            last = last.prev;    //remember this step, this is the advantage of doubly linked list
        } 
    } 
    
    //to delete a node from dll
    public void deleteMe(Node head_ref,Node to_delete){
      //if node to delete is the head
      if(head_ref==to_delete){
    	  head=head_ref.next;
      }
      //if node to delete is not the last node
      if(to_delete.next!=null){
    	  to_delete.next.prev=to_delete.prev;
      }
      //if the node to delete is the last node
    }
    
    //to reverse dll(watch vivekanand algo lecture)
    public void reverse(){
    	Node temp=null;
    	Node curr=head;
    	
    	while(curr!=null){
    		temp=curr.prev;
    	    curr.prev=curr.next;
    	    curr.next=temp;
    	    curr=curr.prev;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
     //    dll.append(6);
     //    dll.push(5);
      //   dll.push(4);
      //   dll.push(5);
         dll.push(30);
         dll.push(8);
         System.out.println("Original linked list ");
         dll.addNodeGeeks(dll.head,1,125);
         dll.printlist(dll.head); 
   
    /*     dll.reverse(); 
         System.out.println(""); 
         System.out.println("The reversed Linked List is "); 
         dll.printlist(dll.head); */
	}

}
