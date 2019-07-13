package binarytrees;
import java.util.*;

public class PreOrderTraversal {

	/* Technique: Use Stack in PreOrder(root->Left Subtree -> Right Subtree)
	 1. First use Root
	 2. In a Stack storage: 7,6,3,5,4,2,1(LIFO)- So this logic will take out 1, than 2 etc.	 
	 */
   public ArrayList<Integer> preorderTraversal(BinaryTreeNode root){
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		if(root == null)return res;
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);   // for pre-order
		while(!s.isEmpty()){
			BinaryTreeNode tmp = s.pop(); //s.pop() will take out the element from stack and put in 'tmp' 
			res.add(tmp.data); //take the tmp node value and put in the list 'res'
			//pay attention here....
			if(tmp.right!=null)s.push(tmp.right); //right sent first to go down
			if(tmp.left!=null)s.push(tmp.left);  //than left, since you want to pick this in next iteration(LIFO)
		}
		return res;
	}

	public static void main(String[] args) {
        PreOrderTraversal pre = new PreOrderTraversal();
        //creating a binary tree
        BinaryTreeNode rootNode = createBinaryTree();
        pre.preorderTraversal(rootNode);
	}

 //BinaryTree created to pass in the main()
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
