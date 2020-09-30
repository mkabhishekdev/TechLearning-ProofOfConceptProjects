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


public class QueueUsingLL2 {

	Node front, rear;
	    
	 
	    // This function should add an item at
	    // rear
		void push(int a)
		{
			Node temp = new Node(a);
	        if(front ==  null){
	            front=rear=temp;
	            return;
	        }
	        rear.next = temp;
	        rear = temp;
		}
		
	    // This function should remove front
	    // item from queue and should return
	    // the removed item.
		int pop()
		{
	        if(front == null)return -1;
	        int remItem = front.data;
	        front = front.next;
	        if(front == null){
	            rear = null;
	        }
	        return remItem; 
	        
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       QueueUsingLL2 qll2 = new QueueUsingLL2();
       qll2.push(1);
       qll2.push(2);
       qll2.push(3);
       qll2.push(4);

 qll2.pop();
	}

}
