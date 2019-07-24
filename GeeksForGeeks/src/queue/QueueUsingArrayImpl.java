package queue;

public class QueueUsingArrayImpl {
	int arr[];
	int index=0;
	int size;
	
	public void push(int data) {
		arr[index]=data;
		index++;
	}
	
	public int pop() {
	   int toDelete = arr[0];
	   for(int i=0;i<arr.length;i++) {
		   i=i+1;
	   }
	}
	
	public QueueUsingArrayImpl(int size) {
	        this.size = size;
	        arr = new int[size];
	    } 
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         QueueUsingArrayImpl queue = new QueueUsingArrayImpl(6);
         queue.push(1);     
         queue.push(2);    
         queue.push(3);    
         queue.push(4);    
         queue.push(5);    
         queue.push(6);    
	}

}
