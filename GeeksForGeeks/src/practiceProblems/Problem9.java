package practiceProblems;
import java.util.*;

public class Problem9 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    int top=-1;
        
	public void enqueue(int data){
	  stack1.push(data);
	  top++;
	}
	
	public int dequeue(){
		int swapRecord=0;
		while(top!=0){
			stack2.push(stack1.pop());
			top--;
			swapRecord++;
		}
		int remove = stack1.pop();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		top=swapRecord-1;
		return remove;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Problem9 p9 = new Problem9();
       p9.enqueue(1);
       p9.enqueue(2);
       p9.enqueue(3);
       p9.enqueue(4);
       p9.enqueue(5);
       System.out.println(p9.dequeue());
       System.out.println(p9.dequeue());
       p9.enqueue(6);
       p9.enqueue(7);
       System.out.println(p9.dequeue());
	}

}
