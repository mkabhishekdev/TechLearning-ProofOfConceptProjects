package binarytrees;
import java.util.*;

public class IsSymmetric {

	 public boolean isSymmetric(TreeNode root) {
	        Stack<TreeNode> stackLeft= new Stack<TreeNode>();
	        Stack<TreeNode> stackRight = new Stack<TreeNode>();
	        List<Integer> leftEnd=new ArrayList<Integer>();
	        List<Integer> rightEnd=new ArrayList<Integer>();
	        int i=0,j=0;
	        TreeNode actual=root;
	        
	        while(root!=null || !stackLeft.empty()){
	            while(root!=null){
	                stackLeft.push(root);
	                root=root.left;
	            }
	            root=stackLeft.pop();
	            leftEnd.add(root.val);
	            i=leftEnd.get(0);
	            break;  
	        }
	        root=actual;
	         while(root!=null || !stackRight.empty()){
	            while(root!=null){
	                stackRight.push(root);
	                root=root.right;
	            }
	            root=stackRight.pop();
	            rightEnd.add(root.val);
	            j=rightEnd.get(0);
	            break;
	        }
	        if(i==j)return true;
	        else return false;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           IsSymmetric is = new IsSymmetric();
       	TreeNode rootNode = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(3);
		
		rootNode.left = node2;
		rootNode.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		System.out.println(is.isSymmetric(rootNode));
	}

}
