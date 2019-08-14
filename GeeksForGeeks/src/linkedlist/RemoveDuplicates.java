package linkedlist;

public class RemoveDuplicates {
    Node head;
	Node removeDuplicates(Node head)
	    {
		   Node curr=head;
		   while(curr.next!=null){
		       if(curr.data==curr.next.data){
		           curr.next=curr.next.next;   // I was not getting this part, I was doing "curr=curr.next.next" instead of "curr.next=curr.next.next"
		       }
		       else{
		       curr=curr.next;}
		   }
		   return head;
	    }
	 
	public void push(int new_data){    //to add new_node at front of linked list
	  Node new_node = new Node(new_data);
      new_node.next = head;
      head=new_node;
	}
	
	public void append(int new_data){ //to insert a new node at the end of a list
		Node new_node = new Node(new_data);
		if(head==null){
			head=new_node;
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last!=null){
			last=last.next;
		}
		last.next = new_node;
	}
	
	public void printMe(){  //to print a linked list
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data + " ");
			curr=curr.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         RemoveDuplicates rd = new RemoveDuplicates();
         rd.head=new Node(5);
         rd.push(4);
         rd.push(2);
         rd.push(2);
         rd.removeDuplicates(rd.head);
         rd.printMe();
	}

}
