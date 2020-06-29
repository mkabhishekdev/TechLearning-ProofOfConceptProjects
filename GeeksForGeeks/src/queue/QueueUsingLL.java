package queue;

class QueueNode{
	int data;
	QueueNode next;
	QueueNode(int x){
		data=x;
		next=null;
	}
}

public class QueueUsingLL {
      QueueNode head;
	  QueueNode front, rear;
	    
	    // This function should add an item at
	    // rear
		void push(int a)
		{
	        QueueNode new_node = new QueueNode(a);
	        if(head==null){
	        	head=new_node;
	        	return;
	        }
	        QueueNode curr=head;
	        while(curr!=null){
	        	curr=curr.next;
	        }
	        new_node=curr;
		}
		
	    // This function should remove front
	    // item from queue and should return
	    // the removed item.
		int pop()
		{
	        int poppedValue;
	        QueueNode curr=head;
	        while(curr.next!=null){
	        	curr=curr.next; 
	        }
	        poppedValue=curr.data;
	        return poppedValue;
	        
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           QueueUsingLL test = new QueueUsingLL();
           test.push(1);
           test.push(2);
           test.push(3);
           test.pop();
	}

}
