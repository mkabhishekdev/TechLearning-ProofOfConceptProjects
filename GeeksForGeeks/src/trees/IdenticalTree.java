package trees;
import java.util.*;

/*class Node{
	int data;
	Node left;
	Node right;
	Node(int x){
		data=x;
		left=null;
		right=null;
	}
}*/

public class IdenticalTree {
    Node root1;
    Node root2;
    
	public boolean isIdentical(Node root1, Node root2){
	 Queue<Node> queue1= new LinkedList<Node>();
	 Queue<Node> queue2 = new LinkedList<Node>();
	 boolean res=false;
	
	if((root1==null)&&(root2==null))return true;
	if((root1==null)||(root2==null))return false;
    queue1.add(root1);
    queue2.add(root2);
    
    while((!queue1.isEmpty())&&(!queue2.isEmpty())){
    	Node curr1=queue1.peek();
    	Node curr2=queue2.peek();
    	
    	if(curr1.data!=curr2.data)return false;
    	queue1.poll();
    	queue2.poll();
        if((curr1.left!=null)&&(curr2.left!=null)){
        	queue1.add(curr1.left);
        	queue2.add(curr2.left);
        }
        else if((curr1.left!=null)||(curr2.left!=null)){
        	return false;
        }
        if((curr1.right!=null)&&(curr2.right!=null)){
        	queue1.add(curr1.right);
        	queue2.add(curr2.right);
        }
        else if((curr1.right!=null)||(curr2.right!=null)){
        	return false;
        }
    }
     return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           IdenticalTree it = new IdenticalTree();
           it.root1 = new Node(1);
           it.root1.left = new Node(2);
           it.root1.right = new Node(3);
           it.root2 = new Node(1);
           it.root2.left = new Node(2);
           it.root2.right = new Node(3);
	}

}
