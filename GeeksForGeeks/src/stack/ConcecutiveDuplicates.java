package stack;
import java.util.*;

public class ConcecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str){
	     Stack<Character> stack = new Stack<Character>();
	     for(int i=0;i<str.length()-1;i++){
	    	 char toInsert=str.charAt(i);
	    	 if(stack.isEmpty()){
	    		 stack.push(toInsert);
	    	 }
	    	 char toCheck = stack.peek();
	    	 if(str.charAt(i+1) != toCheck){
	    		 stack.push(str.charAt(i+1));
	    	 }
	     }
	     String res="";
	     for(int i=0;i<stack.size();i++){
	    	 res+=stack.get(i).toString();
	     }
	     return res;
	    }
	 
	public static void main(String[] args) {
	    ConcecutiveDuplicates cd = new ConcecutiveDuplicates();
	    System.out.println(cd.removeConsecutiveDuplicates("abbccbcd"));
	}

}
