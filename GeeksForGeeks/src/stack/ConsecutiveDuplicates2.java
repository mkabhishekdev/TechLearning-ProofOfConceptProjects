package stack;
import java.util.*;

public class ConsecutiveDuplicates2 {

	public static String removePair(String str){
	        Stack<String> stack = new Stack<String>();
	        
	        for(int i=0;i<str.length();i++){
	        	String toCheck = str.substring(i,i+1);
	        	if(stack.isEmpty())stack.push(toCheck);
	        	else{
	        		if(stack.peek().equals(toCheck)){
	        			stack.pop();
	        		}
	        		else{
	        			stack.push(toCheck);
	        		}
	        	}
	        }
	        String res="";
	        for(int i=0;i<stack.size();i++){
	        	res+=stack.get(i);
	        }
	        return res;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ConsecutiveDuplicates2 cd = new ConsecutiveDuplicates2();
       System.out.println(cd.removePair("aaabbaaccd"));
	}

}
