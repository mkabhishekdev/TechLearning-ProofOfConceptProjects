package practiceProblems;
import java.util.*;

public class Problem1 {

	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    int top=0;              // should remember keeping up a pointer top variable
	public void enqueue(int data) {
	  stack1.push(data);
	  top++;
	}
	
	public int dequeue() {
		
		while(top!=0) {
			stack2.push(stack1.pop());
			top--;
		}
		int result = stack2.pop();
		while(!stack2.isEmpty()) {
		stack1.push(stack2.pop());
		top++;}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Problem1 test = new Problem1();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        System.out.println(test.dequeue());
        test.enqueue(4);
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
	}

}
