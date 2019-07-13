package binarytrees;
import java.util.*;
//POST-ORDER TRAVERSAL: Understand By debugging
/* peek() in Stack is an operation on certain abstract data types, specifically sequential collections such as stacks and queues, 
 which returns the value of the top ("front") of the collection without removing the element from the collection.  */
public class PostOrderTraversal {
    
	public ArrayList<Integer> postOrderTraversal(BinaryTreeNode root){
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		if(root==null)return res;
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);
		BinaryTreeNode prev=null;
		while(!s.isEmpty()){
			BinaryTreeNode curr = s.peek();
			System.out.println(curr);
			if(prev==null || prev.left==curr || prev.right==curr){
				if(curr.left != null)
					s.push(curr.left);
				else if(curr.right!=null)
					s.push(curr.right);
			}
			else if(curr.left == prev){
				if(curr.right!=null)
					s.push(curr.right);
			}
			else{
				res.add(curr.data);
				s.pop();
			}
			prev=curr;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostOrderTraversal pot = new PostOrderTraversal();
		BinaryTreeNode root = createBinaryTree();
		pot.postOrderTraversal(root);

	}

	public static BinaryTreeNode createBinaryTree(){
		BinaryTreeNode rootNode = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		
		rootNode.left = node2;
		rootNode.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		
		return rootNode;
	}
}
