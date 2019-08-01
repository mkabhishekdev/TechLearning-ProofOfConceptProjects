package trees;
import java.util.*;

/* ALGORITHM
 You need to perform [Root-->Left-->Right]
 1. Initialize a stack
 2. Initially, push root to stack to keep it not null
 3. Put condition like, Stack is not empty. Than, inside pop the top element & than push the right & left of top element into stack
 */
public class PreOrder {
    Node root;
	
    public List<Integer> PreOrder(){
    	List<Integer> result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        if(root==null) {
        	return null;
        }
        Node curr=root;
        stack.push(curr);
        while(!stack.isEmpty()) {
        	curr=stack.pop();
        	result.add(curr.data);
        	if(curr.right!=null) {
        	stack.push(curr.right);}
        	if(curr.left!=null) {
        	stack.push(curr.left);}
        }
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PreOrder po = new PreOrder();
        po.root = new Node(10);
        po.root.left = new Node(5);
        po.root.right = new Node(14);
        po.root.left.left = new Node(3);
        po.root.left.right = new Node(7);
        po.root.right.left=new Node(12);
        po.root.right.right = new Node(17);
        System.out.println(Arrays.toString(po.PreOrder().toArray()));
	}
  
}
