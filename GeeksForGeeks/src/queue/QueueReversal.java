package queue;
import java.util.*;

public class QueueReversal {

    public Queue<Integer> rev(Queue<Integer> q){
	       Stack<Integer> stack = new Stack<Integer>();
	       Queue<Integer> res = new LinkedList<Integer>();
	       while(!q.isEmpty()){
	    	   int data=q.poll();
	    	   stack.push(data);
	       }
	       for(int i=stack.size()-1;i>=0;i--){
	    	   res.add(stack.get(i));
	       }
	       return res;
	    }
	   
	public static void main(String[] args) {
		QueueReversal qr = new QueueReversal();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(4);
		queue.add(3);
		queue.add(1);
		queue.add(10);
		queue.add(2);
		queue.add(6);
		System.out.println(queue);
		System.out.println(qr.rev(queue));
	}

}
