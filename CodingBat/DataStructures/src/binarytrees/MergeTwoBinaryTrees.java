package binarytrees;

public class MergeTwoBinaryTrees {
     
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 
	 public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	        
	        if((t1==null) && (t2==null)){
	            return null;
	        }
	        if((t1==null)){
	            t1 = new TreeNode(0);
	        }
	        if(t2==null){
	            t2=new TreeNode(0);
	        }
	        TreeNode mergedTrees = new TreeNode(t1.val+t2.val);
	        mergedTrees.left = mergeTrees(t1.left,t2.left);
	        mergedTrees.right = mergeTrees(t1.right,t2.right);
	        
	        return mergedTrees;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
