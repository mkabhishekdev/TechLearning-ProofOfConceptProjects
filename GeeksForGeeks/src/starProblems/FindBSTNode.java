package starProblems;

public class FindBSTNode {
    Node root;
    
    public boolean FindNode(Node root,int findVal){
    	Node curr=root;
    	boolean res=false;
        if(curr.data==findVal)res=true;
        else if((curr.data>findVal) && (curr.left!=null)){
        	curr=curr.left;
        	res = FindNode(curr,findVal);
        }
        else if((curr.data<findVal) && (curr.right!=null)){
        	curr=curr.right;
        	res= FindNode(curr,findVal);
        }
        else{
        	res = false;
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FindBSTNode bst = new FindBSTNode();
        bst.root = new Node(66);
        bst.root.left = new Node(42);
        bst.root.right = new Node(87);
        bst.root.left.left = new Node(2);
        bst.root.left.right = new Node(45);
        bst.root.right.left = new Node(81);
        bst.root.right.right = new Node(90);
        System.out.println(bst.FindNode(bst.root,81));
	}

}
