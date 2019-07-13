package binarytrees;
import java.util.*;

public class MaxDepth_Take2 {

	public int maxDepth(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList();
        int height=0,nodeCount=0;
        
        while(1==1){
        queue.add(root);
        nodeCount=queue.size();
        if(nodeCount==0)return height;
        height++;
        while(nodeCount>0){
        	BinaryTreeNode node=queue.peek();
        	queue.remove(node);
        	if(node.left!=null)queue.add(node.left);
        	if(node.right!=null)queue.add(node.right);
        	nodeCount--;
        	
        }
        }	
        	   	
	}
	
	public static void main(String[] args) {
		  MaxDepth md = new MaxDepth();
		  BinaryTreeNode root = createBinaryTree();
          System.out.println(md.maxDepth(root));
	}
	public static BinaryTreeNode createBinaryTree(){
		BinaryTreeNode rootNode = new BinaryTreeNode(3);
		BinaryTreeNode node2 = new BinaryTreeNode(9);
		BinaryTreeNode node3 = new BinaryTreeNode(20);
		BinaryTreeNode node4 = null;
		BinaryTreeNode node5 = null;
		BinaryTreeNode node6 = new BinaryTreeNode(15);
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

/*
public class BinaryTreeNode {
	public int data;
	public BinaryTreeNode left;
	public BinaryTreeNode right;

	BinaryTreeNode(int data){
		this.data = data;
	}
}
*/