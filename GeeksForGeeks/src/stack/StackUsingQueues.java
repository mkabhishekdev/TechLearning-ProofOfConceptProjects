package stack;
import java.util.*;

public class StackUsingQueues {

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
