package practiceProblems;

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

public class Problem7 {
    Node head;
    
    public void push(int new_data){
     Node new_node = new Node(new_data);
     if(head==null){
    	 head=new_node;
     }
     else{
    	 new_node.next = head;
    	 new_node.prev = null;
    	 head = new_node;
     }
    }
    
    public void printList(Node root){
    	Node curr=root;
    	while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
    	}
    }
    
    public void insertAfter(Node prev_node, int new_data){
       	Node new_node = new Node(new_data);
       	Node curr=head;
       	while(curr!=prev_node){
       		curr=curr.next;
       	}
       	Node temp=curr.next;
       	curr.next = new_node;
       	new_node.next=temp;
    }
    
    public void append(int new_data){
    	Node new_node = new Node(new_data);
    	Node curr=head;
    	while(curr.next!=null){
    		curr=curr.next;
    		}
    	curr.next = new_node;
    	new_node.next = null;
    }
    
    public void insertBefore(Node given_node,int new_data){
    	Node new_node = new Node(new_data);
    	Node curr=head;
    	while(curr!=given_node){
    		curr=curr.next;
    	}
    	Node temp = curr.prev;
    	curr.prev = new_node;
    	new_node.prev=temp;
    	
    }
    
    public void reverse(Node head){
       Node last_node=null;
       Node curr=head;
       while(curr!=null){
    	   last_node=curr;
    	   curr=curr.next;
       }
       while(last_node!=null){
    	   System.out.println(last_node.data);
    	   last_node=last_node.prev;
       }
       
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Problem7 p7=new Problem7();
       p7.head = new Node(2);
       p7.push(1);
       p7.append(4);
       p7.insertAfter(p7.head.next, 3);
       p7.reverse(p7.head);
     //  p7.printList(p7.head);
	}

}
