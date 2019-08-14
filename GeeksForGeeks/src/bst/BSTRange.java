package bst;
import java.util.*;

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

public class BSTRange {
   
   Node root;
	
	public void printNearNodes(Node root, int k1, int k2)
    {
		if(root==null)return;
		Node curr=root;
	
		if(k1<curr.data){
			curr=curr.left;
			printNearNodes(curr,k1,k2);
		}
		if((k1<=curr.data)&&(k2>=curr.data)){
			System.out.println(curr.data + " ");
		}
		if(k2>curr.data){
			curr=curr.right;
			printNearNodes(curr,k1,k2);
		}
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BSTRange bst = new BSTRange();
        bst.root = new Node(40);
        bst.root.left = new Node(10);
        bst.root.left.left = new Node(5);
        bst.root.left.left.left = new Node(1);
        bst.root.right = new Node(50);
        bst.root.right.right = new Node(100);
        bst.printNearNodes(bst.root, 5, 45);
	}

}
