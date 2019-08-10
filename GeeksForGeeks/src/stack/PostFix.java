package stack;
import java.util.*;

public class PostFix {

	public int evaluatePostFix(String exp){
	      Stack<String> stack = new Stack<String>();
	      List<String> storage = new ArrayList<String>();
	      
	      for(int i=0;i<exp.length();i++){
	    	  String val = exp.substring(i,i+1);
	    	  if((val=="*")||(val=="+")||(val=="/")||(val=="-")){
	    	     int symbol = Integer.parseInt(val);
	    	     int val1,val2;
	    	     if(!storage.isEmpty()){
	    	    	 val1=Integer.parseInt(storage.get(0));
	    	     }
	    	     val1=Integer.parseInt(stack.pop());
	    	     val2=Integer.parseInt(stack.pop());
	    	     int calc;
	    	   
	    	  }
	    	  else{
	    		  stack.push(val);
	    	  }
	      }
	    }
	  
	public static void main(String[] args) {
       PostFix pf  = new PostFix();
       pf.evaluatePostFix("123+*8-");
	}

}
