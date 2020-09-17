  package stack;


/* Implement stack using linked list data structure */
public class StackUsingLinkedListImpl {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
	
	//insert element to the stack
	public void push(int data){
		Node new_node = new Node(data);
		if(head==null){
			head=new_node;
			return;
		}
		Node temp=head;
		new_node.next=temp;
		head=new_node;
	}
	
	//delete element from stack
	public int pop(){
		Node temp=head;
		head=head.next;
		return temp.data;
	}
	
	//get the top element in the stack
	public int peek(){
		return head.data;
	}
	
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
       StackUsingLinkedListImpl stack = new StackUsingLinkedListImpl();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       int x = stack.pop();
       System.out.println("Popped out element from stack is: "+x);
       int y = stack.peek();
       System.out.println("Peek element in the stack is: "+y);
       stack.printList();      
	}

}
