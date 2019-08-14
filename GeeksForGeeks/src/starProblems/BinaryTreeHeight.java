package starProblems;
import java.util.*;
//you can have any number of classes within a program, but the public class will be the one compiler executes(same as the name of the class) & it will have the main() method, only one for a program 

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

//To perform iterative method, we need to use Queue structure since we will Perform Level Order Traversal(BFS) along the tree
/*
 APPROACH:
 You need to have a queue
 Initially, add the root inside queue
 Than keep a size variable, everytime you pass through a level of tree update the height & be checking if size is not 0
 */
public class BinaryTreeHeight {
    Node root;
    
    int height(Node node) 
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);                       
        int height=0;
        while(!queue.isEmpty()){    //initial condition checking if queue is empty
        	int size = queue.size();
        	while(size-->0){    //every level traversal check size
        		Node front = queue.poll();
        		if(front.left!=null){
        			queue.add(front.left);
        		}
        		if(front.right!=null){
        			queue.add(front.right);
        		}
        	}
        	height++;
        }
        return height;
    }   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTreeHeight bth = new BinaryTreeHeight();
        bth.root = new Node(10);
        bth.root.left = new Node(6);
        bth.root.left.right = new Node(4);
        bth.root.left.left = new Node(2);
        bth.root.left.left.left = new Node(1);
        bth.root.right = new Node(14);
        bth.root.right.left = new Node(12);
        bth.root.right.right = new Node(16);
        System.out.println(bth.height(bth.root));
	}

}
