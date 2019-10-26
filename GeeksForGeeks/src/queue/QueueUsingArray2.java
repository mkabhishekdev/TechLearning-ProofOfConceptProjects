package queue;
// Implement queue using array

public class QueueUsingArray2 {

	static int index=0;
	int[] storage;
	int size;
	
	public QueueUsingArray2(int size){
	  	storage = new int[size];
	}
	
	public void enQueue(int item){
	   storage[index]=item;
	   index++;
	}
	
	public int pop(){
		size=storage.length;
		int popMe=storage[0];
		for(int i=0;i<storage.length-1;i++){
			storage[i]=storage[i+1];
		}
		size=size-1;
		return popMe;
	}
	
	public void printQueue(){
		System.out.println("Elements in the queue are: \n");
		for(int i=0;i<storage.length;i++){
			System.out.println(storage[i]+"\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         QueueUsingArray2 qa2 = new QueueUsingArray2(5);
         qa2.enQueue(1);
         qa2.enQueue(2);
         qa2.enQueue(3);
         qa2.enQueue(4);
         qa2.enQueue(5);
         qa2.pop();
         qa2.printQueue();
 
	}

}
