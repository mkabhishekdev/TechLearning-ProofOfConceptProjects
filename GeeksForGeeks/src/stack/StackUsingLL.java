package stack;

class Node
{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}

public class StackUsingLL {
    Node head;
    
	public void push(int data){
	   Node new_node = new Node(data);
	   if(head==null){
		   head=new_node;
		   return;
	   }
       Node top = head;
       new_node.next = top;
       head=new_node;
	 
	}
	
	public int pop(){
	  Node top=head;
	  head=head.next;
	  return top.data;
	}  
	
	public int peek(){
		return head.data;
	}
	
	public void printStack(){
		Node curr=head;
		while(curr!=null){
			System.out.println("elements in the stack are:"+curr.data);
			curr=curr.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StackUsingLL su = new StackUsingLL();
         su.push(1);
         su.push(2);
         su.push(3);
         su.push(4);
         su.push(5);
         su.pop();
         su.printStack();
         System.out.println(su.peek());
	}

}
