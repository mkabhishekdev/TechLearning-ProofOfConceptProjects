package starProblems;
import java.util.*;

public class StackUsingQueues {
/* THE LOGIC I CREATED
 *   Queue<Integer> queue1 = new LinkedList<Integer>();
   Queue<Integer> queue2 = new LinkedList<Integer>();
   int front=0,rear=-1;
   
	public void push(int data){
		queue1.add(data);
		rear++;
	}
	
	public int pop(){
		if(front!=rear){
			queue2.add(queue1.poll());
			rear--;
		}
		int result = queue2.poll();
		while(!queue2.isEmpty()){
			queue1.add(queue2.poll());
			rear++;
		}
		return result;
	}
	*/
	Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int front,rear;
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
    	front=0;
   	    rear=q1.size();
	    while(front!=rear-1) {
	    	q2.add(q1.poll());
	    	rear--;
	    }
	    int popping = q1.poll();
	    q1=q2;
	    return popping;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    front=0;
	    rear=q1.size();
	    q1.add(a);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StackUsingQueues sq = new StackUsingQueues();
        sq.push(1);
        sq.push(2);
        sq.push(3);
        sq.push(4);
        sq.push(5);
       System.out.println(sq.pop());
       System.out.println(sq.pop());
       System.out.println(sq.pop());
	}

}
