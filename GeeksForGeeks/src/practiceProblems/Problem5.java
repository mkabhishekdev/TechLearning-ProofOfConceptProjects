package practiceProblems;
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

public class Problem5 {
    TreeNode root;
	
    TreeNode LCA(TreeNode node, int n1, int n2) 
    {
       List<TreeNode> storageForN1 = new ArrayList<TreeNode>();
       List<TreeNode> storageForN2 = new ArrayList<TreeNode>();
       TreeNode curr = node;
       storageForN1.add(curr);
       storageForN2.add(curr);
       if((curr.data > n1)&&(curr.data < n2)){
    	   while(curr.left.data!=n1){
    	   curr = curr.left;
    	   storageForN1.add(curr);
    	   }
    	   while(curr.right.data!=n2){
    		   curr=curr.right;
    		   storageForN2.add(curr);
    	   }
       }
       if((curr.data > n1)&&(curr.data > n2)){
    	   while(curr.left.data!=n1){
    	   curr = curr.left;
    	   storageForN1.add(curr);
    	   }
    	   while(curr.right.data!=n2){
    		   curr=curr.left;
    		   storageForN2.add(curr);
    	   }
       }
       curr=node;

       TreeNode res=null;
       for(int i=0;i<storageForN1.size();i++){
    	   for(int j=0;j<storageForN2.size();j++){
    		   if(storageForN1.get(i)==storageForN2.get(j)){
    			  res=storageForN1.get(i);
    		   }
    	   }
       }
       return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Problem5 p5 = new Problem5();
        p5.root = new TreeNode(12);
        p5.root.left = new TreeNode(9);
        p5.root.left.right = new TreeNode(10);
        p5.root.left.left = new TreeNode(8);
        p5.root.right = new TreeNode(14);
        p5.root.right.right = new TreeNode(15);
        System.out.println(p5.LCA(p5.root, 8, 15).data);
	}

}
