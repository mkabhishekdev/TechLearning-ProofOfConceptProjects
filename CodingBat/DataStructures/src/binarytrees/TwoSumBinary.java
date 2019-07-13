package binarytrees;
import java.util.*;

public class TwoSumBinary {

	public boolean findTarget(TreeNode root, int k) {
	        List<Integer> store = new ArrayList<Integer>();
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        int innerSum=0;
	        boolean res=false;;
	        
	        while(root!=null || !stack.isEmpty()){
	            while(root!=null){
	                stack.push(root);
	                root=root.left;
	            }
	            root=stack.pop();
	            store.add(root.val);
	            root=root.right;
	        }
	        for(int i=0;i<store.size();i++){
	            for(int j=0;j<store.size() && j!=i;j++){
	                innerSum=store.get(i)+store.get(j);
	                if(innerSum==k){
	                	res=true;
	                	break;
	                }
	            }
	        }
	        return res;
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            TwoSumBinary tsb = new TwoSumBinary();
	       	TreeNode rootNode = new TreeNode(2);
			TreeNode node2 = new TreeNode(1);
			TreeNode node3 = new TreeNode(3);
		//	TreeNode node4 = new TreeNode(2);
		//	TreeNode node5 = new TreeNode(4);
		//	TreeNode node7 = new TreeNode(7);
			
			rootNode.left = node2;
			rootNode.right = node3;
			
		//	node2.left = node4;
		//	node2.right = node5;
			
		//	node3.left = node6;
		//	node3.right = node7;
			System.out.println(tsb.findTarget(rootNode, 3));

	}

}
