package queue;
import java.util.*;

public class ReverseElements {

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
	    {
	      Stack<Integer> stack = new Stack<Integer>();
	
	      for(int i=0;i<k;i++){
	    	  stack.push(q.poll());
	      }
	      Queue<Integer> result = new LinkedList<Integer>();
	      for(int i=stack.size()-1;i>=0;i--){
	    	  result.add(stack.get(i));
	      }
	      if(!q.isEmpty()){
	      for(int i=q.size();i>0;i--){
	    	  result.add(q.poll());
	      }
	      }
	      return result;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ReverseElements re = new ReverseElements();
       Queue<Integer> input = new LinkedList<Integer>();
       input.add(1);
       input.add(2);
       input.add(3);
       input.add(4);
       input.add(5);
       System.out.println(re.modifyQueue(input,2));
	}

}
