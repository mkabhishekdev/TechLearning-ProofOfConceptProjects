package binarytrees;
import java.util.*;

public class MaxDepth {

	public int maxDepth(BinaryTreeNode root) {
		if (root == null)
			return 0;
		
		Deque<BinaryTreeNode> stack = new LinkedList<BinaryTreeNode>();
		
		stack.push(root);
		int count = 0;
		
		while (!stack.isEmpty()) {
			int size = stack.size();
			while (size-- > 0) {
				BinaryTreeNode cur = stack.pop();
				if (cur.left != null)
					stack.addLast(cur.left);
				if (cur.right != null)
					stack.addLast(cur.right);
			}
			count++;

		}
		return count;

	}
	public static void main(String[] args) {
		  MaxDepth md = new MaxDepth();
		  BinaryTreeNode root = createBinaryTree();
          md.maxDepth(root);
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
