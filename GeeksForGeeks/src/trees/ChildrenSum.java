package trees;

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

public class ChildrenSum {
  Node root;
  
   public int calculateTreeSum(Node node){
	  Node curr=node;
	  int sum=0;
	  int res=-1;
	  while(curr!=null){
		  if((curr.left!=null)&&(curr.right!=null)){
			  sum=curr.left.data+curr.right.data;
		  }
		  if((curr.left==null)&&(curr.right!=null)){
			  sum=curr.right.data;
		  }
		  if((curr.left!=null)&&(curr.right==null)){
			  sum=curr.left.data;
		  }
		  if(sum!=curr.data){ 
			  res=0;
			  break;
		  }
		  
		  }
	  return res;
	  }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChildrenSum cs = new ChildrenSum();
        cs.root = new Node(10);
        cs.root.left=new Node(5);
        cs.root.right=new Node(2);
        cs.root.left.left=new Node(3);
        cs.root.left.right=new Node(5);
        cs.root.right.left=new Node(2);
        System.out.println(cs.calculateTreeSum(cs.root));
	}
}
