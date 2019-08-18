package trees;

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

public class PathSum {
    Node root;
    boolean hasPathSum(Node node, int sum)
	    {
    	    boolean res=false;
	        Node curr=root;
	        int leftSum=0,rightSum=0;
	        while(curr!=null){
	        	leftSum+=curr.data;
	        	curr=curr.left;
	        }
	        curr=root;
	        while(curr!=null){
	        	rightSum+=curr.data;
	        	curr=curr.right;	    
	        }
	        if((leftSum==sum) || (rightSum==sum))res=true;
	        return res;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PathSum ps = new PathSum();
        ps.root = new Node(1);
        ps.root.left = new Node(2);
        ps.root.right = new Node(3);
        System.out.println(ps.hasPathSum(ps.root, 4));
	}

}
