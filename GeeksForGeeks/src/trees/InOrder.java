package trees;
import java.util.*;

/* ALGORITHM
You need to perform [Left-->Root-->Right]
1. Initialize a stack
2. Put the condition like when current is not null, first push the value into the stack & increment current.left
3. Pop the current element & update current to right
*/
public class InOrder {
    Node root;
	List<Integer> InTraversal(){
		List<Integer> result = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		if(root==null) {
			return null;
		}
		Node curr = root;
		while(curr!=null || stack.size()>0) {
		while(curr!=null) {
			stack.push(curr);
			curr=curr.left;
		}
		curr=stack.pop();
		result.add(curr.data);
		curr=curr.right;
		}
		return result;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InOrder io = new InOrder();
		io.root = new Node(10);
        io.root.left = new Node(5);
        io.root.right = new Node(14);
        io.root.left.left = new Node(3);
        io.root.left.right = new Node(7);
        io.root.right.left = new Node(12);
        io.root.right.right = new Node(17);
        System.out.println(Arrays.toString(io.InTraversal().toArray()));
	}

}
