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

public class LevelOrderTraversal {
    Node root;
    
    public List<Node> LevelOrder(Node root){
    	List<Node> storage = new ArrayList<Node>();
    	Queue<Node> queue = new LinkedList<Node>();
    	
    	Node curr=root;
    	while(curr!=null){
    		queue.add(curr);
    		if((curr.left!=null)&&(curr.right!=null)){
    			queue.add(curr.left);
    			queue.add(curr.right);
    			storage.add(queue.poll());
    		}
    		curr=queue.poll();
    	}
    	return storage;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LevelOrderTraversal lot = new LevelOrderTraversal();
        lot.root = new Node(1);
        lot.root.left = new Node(2);
        lot.root.right = new Node(3);
        lot.root.left.left = new Node(4);
        lot.root.left.right = new Node(5);
        System.out.println(lot.LevelOrder(lot.root));
        
	}

}
