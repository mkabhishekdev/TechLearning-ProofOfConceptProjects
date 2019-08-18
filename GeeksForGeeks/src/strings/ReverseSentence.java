package strings;
import java.util.*;

public class ReverseSentence {

 
   public void reverseWords(String sd[]) {
	   Stack<String> stack1 = new Stack<String>();
	   Stack<String> stack2 = new Stack<String>();
	   
	   for(int i=0;i<sd.length;i++){
		   while(!sd[i].equals(".")){
			   stack1.push(sd[i]);
		   }
		   while(!stack1.isEmpty()){
			   stack2.push(stack1.pop());
		   }
		//   stack2.push(".");
		   while(!stack2.isEmpty()){
			   System.out.println(stack2.pop());
		   }
	   }
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ReverseSentence rs = new ReverseSentence();
        String sd[] = {"p","q","r",".","m","n","o"};
        rs.reverseWords(sd);
	}

}
