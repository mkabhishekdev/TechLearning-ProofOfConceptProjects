package starProblems;
import java.util.*;

public class QueueUsingStacks {

	    Stack<Integer> s1 = new Stack<Integer>();
	    Stack<Integer> s2 = new Stack<Integer>();
	    int top=-1;
	    /* The method insert to push element
	       into the queue */
	    void insert(int B)
	    {
	    	s1.push(B);
	    	top++;
	    }
		
	    
	    /* The method remove which return the
	      element popped out of the queue*/
	    int remove()
	    {
		  while(top!=0) {
			  s2.push(s1.pop());
			  top--;
		  }
		  int popping=s1.pop();
		  s1=s2;
		  return popping;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       QueueUsingStacks qs = new QueueUsingStacks();
       qs.insert(1);
       qs.insert(2);
       qs.insert(3);
       qs.insert(4);
       qs.insert(5);
       System.out.println(qs.remove());
       System.out.println(qs.remove());
	}

}
