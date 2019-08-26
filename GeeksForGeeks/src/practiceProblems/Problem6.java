package practiceProblems;

/*class Node{
   int data;
   Node next;
   Node(int x){
	   data=x;
	   next=null;
   }
}*/

public class Problem6 {

	Node head;
	
	public void push(int new_data){
		Node new_node = new Node(new_data);
		if(head==null){
			head=new_node;
		}
		else{
			new_node.next = head;
			head=new_node;
		}
	}
	
	public void append(int new_data){
		Node new_node = new Node(new_data);
		Node curr=head;
		while(curr.next!=null){
			curr=curr.next;		
		}
		curr.next=new_node;
		new_node.next=null;
	}
	
	public void insertAfter(Node prev_Node,int new_data){
		Node new_node = new Node(new_data);
		Node temp = prev_Node.next;
		prev_Node.next = new_node;
		new_node.next=temp;
	}
	
	public void deleteNode(int delete_data){
		Node to_delete = new Node(delete_data);
		Node curr=head;
		if(curr.next.data!=to_delete.data){
			curr=curr.next;
		}
		Node prev = curr;
		prev.next = prev.next.next;
	}
	
    public boolean search(Node head,int x){
		boolean res=false;
		Node curr=head;
		Node to_search = new Node(x);
		if(curr.data!=to_search.data){
			curr=curr.next;
		}
		if(curr!=null)res=true;
		return res;
	}
	
	public Node reverse(Node nodeToReverse){
	   	Node prev=null;
	   	Node curr=nodeToReverse;
	   	Node next=null;
	   	
	   	while(curr!=null){
	   		next=curr.next;
	   		curr.next=prev;
	   		prev=curr;
	   		curr=next;
	   	}
	   	head=prev;
	   	return nodeToReverse;
	} 
	
	public void printLL(){
		Node printMe=head;
		System.out.println(printMe.data);
		while(printMe.next!=null){
			printMe=printMe.next;
			System.out.println(printMe.data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Problem6 p6= new Problem6();
         p6.push(3);
         p6.push(2);
         p6.push(1);
         p6.append(4);
         p6.append(6);
         p6.insertAfter(p6.head.next.next.next,5);
       //  p6.deleteNode(3);
         p6.search(p6.head,4);
         p6.reverse(p6.head);
         p6.printLL();
        
	}

}
