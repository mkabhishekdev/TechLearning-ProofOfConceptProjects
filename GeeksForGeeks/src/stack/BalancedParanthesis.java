package stack;

import java.util.Stack;

public class BalancedParanthesis {

	public boolean checkBalance(String input){
		boolean res=false;
		int size = input.length()/2;
		int count=0;
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<input.length();i++){
			if((input.substring(i,i+1).equals("[")) || (input.substring(i,i+1).equals("("))){
				stack.push(input.substring(i,i+1));
			}
			else{
			    String checkVal = input.substring(i, i+1);
				String outFromStack  = stack.pop();
				if((checkVal.equals(")")&&(outFromStack.equals("(")))){
					count++;
				}
				if((checkVal.equals("]")&&(outFromStack.equals("[")))){
					count++;
				}
				
			}
		}
		if(size==count)res=true;
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BalancedParanthesis bp = new BalancedParanthesis();
       System.out.println(bp.checkBalance("[()]"));
	}

}
