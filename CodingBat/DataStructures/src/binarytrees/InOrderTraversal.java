package binarytrees;
import java.util.*;

public class InOrderTraversal {

	/*
	  Inorder Technique: 
	  1. Left SubTree
	  2. Root
	  3. Right Subtree
	  DEBUG this program to review the workflow   
	 */
	public ArrayList<Integer> InOrderTraversal(BinaryTreeNode root){
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		
		BinaryTreeNode currentNode = root;
		boolean check=false;
		s.push(root);
		while(!check){
			if(currentNode!=null){
				s.push(currentNode); //Mistake you made, use 'push()' in stacks not 'add()'
				currentNode = currentNode.left;
			}
			else{
				if(s.isEmpty())check=true;
				else {
					currentNode = s.pop();
					res.add(currentNode.data);
					currentNode = currentNode.right;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           InOrderTraversal iot = new InOrderTraversal();
           BinaryTreeNode root = createBinaryTree();
           System.out.println(iot.InOrderTraversal(root));
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
