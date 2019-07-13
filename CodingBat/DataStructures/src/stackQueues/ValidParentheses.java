package stackQueues;
import java.util.*;

public class ValidParentheses {

	public boolean isValid(String s){
		Stack<Character> stack = new Stack<Character>();
		
		for(char c : s.toCharArray()){
			if(c == '('){
				stack.push(')');
			}
			else if(c == '{'){
				stack.push('}');
			}
			else if(c == '['){
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop() != c){ /* this line actually does the stack.pop() */
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("{[]}"));
	}

}
