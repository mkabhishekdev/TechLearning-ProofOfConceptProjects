package queue;

class Node
{
  int data;
  Node next;
  Node(int x)
  {
	  data=x;
	  next=null;
  }
}

//REWORK ON THIS PROBLEM
public class QueueUsingLL2 {

	Node head;
	
	public void Add(int element)
	{
	  Node newValue = new Node(element);
	  if(head==null)
	  {
		  head=newValue;
		  return;
	  }
	  Node curr=head;
	  while(curr!=null)
	  {
		 curr = curr.next;
	  }
	  
	}
	
	public int Peek()
	{
	   if(head.next==null)return head.data;
	   Node curr=head;
	   while(curr.next!=null){
		   curr=curr.next;
	   }
	   return curr.data;
	}
	
	public void PrintQueue()
	{
		Node curr=head;
		while(curr.next!=null)
		{
			System.out.println("Element:"+curr.data);
			curr=curr.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       QueueUsingLL2 qll2 = new QueueUsingLL2();
       qll2.Add(1);
       qll2.Add(2);
       qll2.Add(3);
       qll2.Add(4);
       qll2.PrintQueue();
     //  qll2.Peek();
	}

}
