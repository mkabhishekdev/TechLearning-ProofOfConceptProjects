package bst;

class Node{
	int data;
	Node left;
	Node right;
	Node(int x){
		data=x;
		left=null;
		right=null;
	}
}

public class CheckBST {
    Node root;
    
	public boolean EvaluateBST(Node root){
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CheckBST bst = new CheckBST();
        bst.root = new Node(10);
        bst.root.left = new Node(5);
        bst.root.left.right = new Node(3);
        bst.root.left.left = new Node(1);
        bst.root.right = new Node(15);
        bst.root.right.left = new Node(12);
        bst.root.right.right = new Node(18);
	}

}
