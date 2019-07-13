package arrays;
import java.util.*;

public class Leaders {

   public ArrayList<Integer> leaders(int arr[], int n){
	       ArrayList<Integer> res = new ArrayList<Integer>();
	       int count=0;
	       
	       for(int i=0;i<n;i++){
	           for(int j=i+1;j<n;j++){
	               if(arr[i]<arr[j])count++;
	           }
	           if(count==0)res.add(arr[i]);
	           count=0;
	       }
	       res.add(arr[arr.length-1]);
	       return res;
	    }
   
	public static void main(String[] args) {
		Leaders l = new Leaders();
        int test[]={16,17,4,3,5,2};
        System.out.println(l.leaders(test, 5));
	}

}
