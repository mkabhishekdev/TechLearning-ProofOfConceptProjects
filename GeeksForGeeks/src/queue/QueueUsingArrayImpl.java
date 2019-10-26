package queue;

public class QueueUsingArrayImpl {
    int[] arr;
    int index=0;
    int front,rear;
    int size;
	
	public void enqueue(int data) {
     arr[index]=data;
     index++;
	}
	
	public int dequeue() {
	  size=arr.length;
	  int temp=arr[0];
	  for(int i=0;i<arr.length-1;i++){
		  arr[i]=arr[i+1];
	  }
	  size=size-1;
	  return temp;
	} 
	
	public QueueUsingArrayImpl(int size) {
	        arr = new int[size];
	    } 
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         QueueUsingArrayImpl queue = new QueueUsingArrayImpl(6);
         queue.enqueue(1);
         queue.enqueue(2);
         queue.enqueue(3);
         queue.enqueue(4);
         queue.enqueue(5);
         queue.enqueue(6);
         queue.dequeue();
	}

}
