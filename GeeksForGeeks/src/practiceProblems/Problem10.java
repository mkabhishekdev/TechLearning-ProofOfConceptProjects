package practiceProblems;

/*class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
} */

public class Problem10 {
Node head;

	public Node reverseList(Node nodeToReverse){
		Node prev=null;
		Node curr=nodeToReverse; 
		Node next=null;
		while(curr!=null){  //2,3 
		  next=curr.next; //2,3
		  curr.next = prev; //null,1
		  prev=curr; //1,2
		  curr=next; //2,3
		}
		head=prev;
		return head;
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
	
	public void printList(){
		Node printMe;
		printMe=head;
		while(printMe!=null){
			System.out.println(printMe.data + " ");
			printMe=printMe.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Problem10 p10 = new Problem10();
       p10.head = new Node(1);
       p10.append(2);  
       p10.append(3);
       p10.append(4);
       p10.append(5);
       p10.reverseList(p10.head);
       p10.printList();
	}

}
