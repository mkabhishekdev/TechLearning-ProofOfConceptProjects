package trees;

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

public class MirrorTree {
    TreeNode root;
	
    public TreeNode Mirror(TreeNode root) {
      	if(root == null) return null;
      	
      	TreeNode left = Mirror(root.left);
      	TreeNode right = Mirror(root.right);
      	
      		TreeNode temp=root.left;
      		root.left=root.right;
      		root.right=temp;
      return root;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MirrorTree mt = new MirrorTree();
         mt.root = new TreeNode(1);
         mt.root.left = new TreeNode(3);
         mt.root.right= new TreeNode(2);
         mt.root.right.left = new TreeNode(5);
         mt.root.right.right = new TreeNode(4);
	}

}
