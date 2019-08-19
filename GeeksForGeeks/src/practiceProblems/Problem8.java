package practiceProblems;
import java.util.*;

public class Problem8 {
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();
	
	public void push(int data){

		queue1.add(data);
	}
	
	public int pop(){
		int size=queue1.size();
		while(size!=1){
			queue2.add(queue1.poll());
			size--;
		}
		int remove = queue1.poll();
		queue1=queue2;
		return remove;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Problem8 p8 = new Problem8();
       p8.push(1);
       p8.push(2);
       p8.push(3);
       p8.push(4);
       p8.pop();
       p8.push(5);
       p8.push(6);
       System.out.println(p8.pop());
	}

}
