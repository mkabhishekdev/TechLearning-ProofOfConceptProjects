package trees;
import java.util.*;
/*ALGORITHM
 Level order involves using Queue structure
 1. Create a Queue, add the root initially to it.
 2. While checking whether queue is empty,be popping out the queue->save it to curr variable
 3. check whether curr->left exists, if yes add to queue. Similarly check for curr->right exists
 4. return the result
 */
public class LevelOrder {
    Node root;
    
    public List<Node> levelTraversal(){
    	if(root == null) {
    		return null;
    	}
    	List<Node> res = new ArrayList<Node>();
    	Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node curr=root;
        while(!queue.isEmpty()) {
        	curr=queue.poll();
        	res.add(curr);
        	if(curr.left!=null) {  
        		queue.add(curr.left);
        	
        	}
        	if(curr.right!=null) {
        		queue.add(curr.right);

        	}
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LevelOrder lo = new LevelOrder();
       lo.root = new Node(10);
       lo.root.left = new Node(3);
       lo.root.right = new Node(8);
       lo.root.left.left = new Node(9);
       lo.root.left.right = new Node(12);
       lo.root.right.left = new Node(7);
       System.out.println(Arrays.toString(lo.levelTraversal().toArray()));
	}

}
