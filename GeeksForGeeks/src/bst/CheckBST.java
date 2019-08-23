package bst;
import java.util.*;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		data=x;
		left=null;
		right=null;
	}
}

public class CheckBST {
	TreeNode root;
    
    public boolean EvaluateBST(TreeNode root) {
    	TreeNode curr=root;
        List<Integer> storage = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while((curr!=null) || (stack.size()>0)) {
        	while(curr!=null) {
        		stack.push(curr);
        		curr=curr.left;
        	}
        	curr=stack.pop();
        	storage.add(curr.data);
        	curr=curr.right;
        }
        int count=0;
        for(int i=0;i<storage.size()-1;i++) {
        	if((storage.get(i+1))<(storage.get(i))) {
        		count++;
        		break;
        	}
        }
        if(count>0)return false;
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CheckBST bst = new CheckBST();
        bst.root = new TreeNode(20);
        bst.root.left = new TreeNode(10);
        bst.root.left.left = new TreeNode(5);
        bst.root.left.right = new TreeNode(15);
        bst.root.right = new TreeNode(30);
        bst.root.right.left = new TreeNode(25);
        bst.root.right.right = new TreeNode(35);
        System.out.println(bst.EvaluateBST(bst.root));
	}

}
