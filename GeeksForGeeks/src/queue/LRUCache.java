package queue;
import java.util.*;

class lruNode{
	String data;
	lruNode next;
	lruNode prev;
	lruNode(String x){
		data=x;
		next=null;
		prev=null;
	}
}

public class LRUCache {
	lruNode head;
	 Map<Integer,Integer> map;
	    int capacity;
	    /*Inititalize an LRU cache with size N */
	    public LRUCache(int N) {
	       
	    }
	    
	    /*Returns the value of the key x if 
	     present else returns -1 */
	    public int get(int x) {
	       //Your code here
	    }
	    
	    /*Sets the key x with value y in the LRU cache */
	    public void set(int x, int y) {
	       //Your code here
	    }
	    
	    public void addToLRU(String new_item){
	    	lruNode new_node = new lruNode(new_item);
	    	lruNode curr=head;
	    	if(head==null){
	    		head=new_node;
	    	}
	    	else{
	    		while(curr!=null){
	    			curr=curr.next;
	    		}
	    		curr=new_node;
	    		new_node.next=null;
	    	}
	    	
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LRUCache lc = new LRUCache(3);
         lc.addToLRU("chocolate");
         lc.addToLRU("vanilla");
         lc.addToLRU("strawberry");
         
	}

}
