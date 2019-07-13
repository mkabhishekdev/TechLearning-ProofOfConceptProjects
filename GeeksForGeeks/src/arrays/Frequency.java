package arrays;
import java.util.*;

//Frequencies of Limited Range Array Elements
public class Frequency {

	public boolean printFrequency(int arr[], int n){
	    boolean res=true;  
		int count=0;
	      Map<Integer,Integer> check = new HashMap<Integer,Integer>();
	    
	      for(int i=1;i<=n;i++){
	          for(int j=0;j<n;j++){
	              if(i==arr[j]){
	                  count++;
	              }
	          }
	          System.out.println(i+":"+count);
              check.put(i,count);
              count=0;
	      }
	      return res;
	    }
	 
	public static void main(String[] args) {
	   Frequency f = new Frequency();
	   int test[] = {2,3,2,3,5};
	   System.out.println(f.printFrequency(test,5));

	}
	
}
