package heaps;
import java.util.*;

public class KLargest {

    public void kthLargest(int arr[], int n, int k){
	              int max;
	              List<Integer> storage = new ArrayList<Integer>();
	              List<Integer> largestValues = new ArrayList<Integer>();
	              for(int i=0;i<arr.length;i++) {
	            	  storage.add(arr[i]);
	              }
	           
	              for(int i=1;i<storage.size() && k!=0;i++) {
	            	  max=arr[0];
	            	  if(storage.get(i)>max) {
	            		  max=storage.get(i);
	            		  storage.remove(i);
	            		  largestValues.add(max);
	            	  	  k--;
	            	  } 
	          
	            	  }
	            
	            	 
	              
	           
	              
	          //    System.out.println(max);
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        KLargest kl = new KLargest();
        int[] input = {1,23,12,9,30,2,50};
        kl.kthLargest(input,7,3);
	}

}
