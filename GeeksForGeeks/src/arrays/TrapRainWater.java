package arrays;
import java.util.*;

public class TrapRainWater {

   public int trappingWater(int arr[], int n) { 
       List<Integer> storage = new ArrayList<Integer>();
	   int left=arr[0];
       int right=arr[n-1];
       int barHeight=0,barIndex=-1;
       int waterAmount=0;
       for(int i=1;i<n;i++) {
    	   barHeight=arr[i];
    	   barIndex=i;
    	   for(int j=0;j<barIndex;j++) {
    		   if(arr[j]>left) {
    			   left=arr[j];
    		   }
    	   }
    	   for(int k=barIndex+1;k<n;k++) {
    		   if(arr[k]>right) {
    			   right=arr[k];
    		   }
    	   }
    	   if(barHeight>minCalculator(left,right)) {
    		   waterAmount=0;
    	   }
    	   else {
    	   if(barIndex!=n-1) {
    	   waterAmount=minCalculator(left,right)-barHeight;
    	   }
    	   }
    	   storage.add(waterAmount);
       }
       int total=0;
       for(int i=0;i<storage.size();i++) {
    	   total+=storage.get(i);
       }
       return total;
    } 
   
   public int minCalculator(int left,int right) {
	   if(left<right)return left;
	   return right;
   }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TrapRainWater tr = new TrapRainWater();
          int input[] = {8,8,2,4,5,5,1};
          System.out.println(tr.trappingWater(input, 7));
	}

}
