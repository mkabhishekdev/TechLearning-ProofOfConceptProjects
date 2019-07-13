package all;
import java.util.*;

public class StackTest {
	    int min = Integer.MAX_VALUE;
	    Stack<Integer> stack= new Stack<Integer>();
	    /** initialize your data structure here. */
	    
	    public void push(int x) {
	         if(x<=min){
	             stack.push(min);
	             min=x;
	         }
	        stack.push(x);
	    }
	    
	    public void pop() {
	    	  if(stack.pop() == min) min=stack.pop();
	    }
	    
	    public int top() {
	       return stack.peek();
	    }
	    
	    public int getMin() {
	         return min;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            StackTest st  = new StackTest();
            st.push(5);
            st.push(10);
            st.push(15);
            st.push(30);
            st.push(2);
            st.pop();
            int param_3=st.top();
            int param_4=st.getMin();
            System.out.println(param_3);
            System.out.println(param_4);       
	}
}
