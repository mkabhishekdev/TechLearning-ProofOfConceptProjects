package linkedlist;

class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}

public class SingleLLReview {
    Node head;

    //insert in front of LL
    public void push(int data){
      Node new_node = new Node(data);
      if(head==null){
    	  head=new_node;
    	  head.next=null;
      }
      else{
    	  head.next=new_node;
    	  new_node.next=null;
      }
    }
    
    //insert at end of LL
    public void append(int data){
      	Node new_node=new Node(data);
      	Node curr=head;
      	
      	while(curr.next!=null){
      		curr=curr.next;
      	}
      	curr.next=new_node;
      	new_node.next=null;
    }
    
    //to delete a node in LL -- continue from here, need to test the below
    public void delete(int data){
    	Node remove_node = new Node(data);
    	Node curr=head;
    	while(curr.next!=null){
    		if(curr.data==data){
    			curr=curr.next;
    		}
    		curr=curr.next;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           SingleLLReview sr = new SingleLLReview();
           sr.push(5);
           sr.push(4);
           sr.push(3);
           sr.push(2);
           
	}

}
