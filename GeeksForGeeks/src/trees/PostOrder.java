package trees;
import java.util.*; 
 
public class PostOrder {

	public List<Node> PostTraversal(Node root){
		List<Node> store=new ArrayList<Node>();
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		Node curr=root;
  		stack1.push(root);
		while((curr!=null) && (!stack1.isEmpty())) {
			Node transferNode=stack1.pop();
			stack2.push(transferNode);
			if(curr.left!=null)stack1.push(curr.left);
			if(curr.right!=null)stack1.push(curr.right);
			if(!stack1.isEmpty())curr=stack1.peek();
		}
		for(int i=stack2.size()-1;i>=0;i--) {
			store.add(stack2.get(i));
		}
		return store;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PostOrder po = new PostOrder();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(15);
        root.right.right = new Node(6);
	}

}
