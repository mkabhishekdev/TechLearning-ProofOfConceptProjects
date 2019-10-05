package practiceProblems;
/* Single Linked List Operations */
public class Problem11Review {
	
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
	
    Node head;
	//front of list
	public void push(int new_item){
		Node newItem=new Node(new_item);
		if(head==null)head=newItem;
		else{
			newItem.next=head;
			head=newItem;
		}
	}
	
	//end of list
	public void append(int new_item){
		Node newItem = new Node(new_item);
		Node curr=head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=newItem;
		newItem.next=null;
	}
	
	//print list
	public void printList(){
	  Node curr=head;
	  while(curr!=null){
		  System.out.println(curr.data + " ");
		  curr=curr.next;
	  }
	}
	
	//delete a node from list
	
	
	
	//search a node from list
	
	
	//reverse a list
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Problem11Review p11 = new Problem11Review();
        p11.push(3);
        p11.push(2);
        p11.push(1);
        p11.append(4);
        p11.printList();
	}

}
