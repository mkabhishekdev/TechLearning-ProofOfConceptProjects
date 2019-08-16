package practiceProblems;
import java.util.*;

public class Problem4 {
   Queue<Integer> queue1 = new LinkedList<Integer>();
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Problem4 p4 = new Problem4();
        p4.push(1);
        p4.push(2);
        p4.push(3);
        p4.push(4);
        System.out.println( p4.pop());
        p4.push(5);
        p4.push(6);
        System.out.println( p4.pop());
	}

}
