package stack;



public class StackUsingLLPractice3 {
    
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
	
	public void Push(int data)
	{
	  Node newNode = new Node(data);
	  if(head == null){
		  head=newNode;
		  return;
	  }
	  Node temp = head;
	  newNode.next = temp;
	  head = newNode;
	}
	
	public int Peek()
	{
	  return head.data;	  
	}
	
	public void Pop()
	{
	   Node temp = head;
	   head = head.next;
	}
	
	public void printOutput()
	{
		Node printMe=head;
		while(printMe!=null){
			System.out.println(printMe.data);
			printMe=printMe.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingLLPractice3 sll3 = new StackUsingLLPractice3();
	    sll3.Push(1);
	    sll3.Push(2);
	    sll3.Push(3);
	    sll3.Push(4);
	    sll3.Push(5);
	    sll3.Pop();
	    sll3.printOutput();
	    
	}

}
