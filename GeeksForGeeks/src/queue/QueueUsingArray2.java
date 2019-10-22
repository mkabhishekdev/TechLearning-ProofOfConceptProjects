package queue;
// Implement queue using array

public class QueueUsingArray2 {

	static int i=0;
	int[] storage;
	
	public void enQueue(int item){
	   storage[i]=item;
	   i++;
	}
	
	public int pop(){
		int popMe;
		while(storage.length>0){
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         QueueUsingArray2 qa2 = new QueueUsingArray2();
         qa2.enQueue(1);
         qa2.enQueue(2);
         qa2.enQueue(3);
         qa2.enQueue(4);
         qa2.enQueue(5);
	}

}
