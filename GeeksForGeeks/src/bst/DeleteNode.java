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

public class DeleteNode {
    Node root;
    
	public Node deleteOperation(Node root,int key){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           DeleteNode dn = new DeleteNode();
           dn.root = new Node(20);
           dn.root.left=new Node(10);
           dn.root.left.left=new Node(1);
           dn.root.left.right=new Node(15);
           dn.root.right=new Node(30);
           dn.root.right.left=new Node(25);
           dn.root.right.right=new Node(40);
           
	}

}
