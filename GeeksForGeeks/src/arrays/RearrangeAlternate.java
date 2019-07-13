package arrays;
import java.util.*;

public class RearrangeAlternate {
   public int rearrange(int arr[], int n){
	       int max=arr[0],min=arr[0],me=-1;
	       ArrayList<Integer> test = new ArrayList<Integer>();
	       for(int i=0;i<arr.length;i++){
	    	   test.add(arr[i]);
	       }
	       if(!test.isEmpty()){
		     ArrayList<Integer> result = new ArrayList<Integer>();
		       for(int i=0;i<test.size();i++){
		           if(max<test.get(i)){
		               max=i;
		           }
		       }
		       for(int i=0;i<test.size();i++){
		           if(min>test.get(i)){
		               min=i;
		           }
		       }
		       result.add(max);
		       result.add(min);
		       test.remove(min);
		       test.remove(max-1);
	       }
	     return me;
   }
   
 /*  public void perform(ArrayList<Integer> test){
	     int max=-1,min=-1,me=-1;
	     ArrayList<Integer> result = new ArrayList<Integer>();
	       for(int i=0;i<test.size();i++){
	           if(max<test.get(i)){
	               max=i;
	           }
	       }
	       for(int i=0;i<test.size();i++){
	           if(min>test.get(i)){
	               min=i;
	           }
	       }
	       result.add(max);
	       result.add(min);
	       test.remove(min);
	       test.remove(max-1);
   } */
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  RearrangeAlternate ra = new RearrangeAlternate();
          int test[]={1,2,3,4,5,6};
          System.out.println(ra.rearrange(test,6));
	}

}
