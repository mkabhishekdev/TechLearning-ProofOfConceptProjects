package practiceProblems;
import java.util.*;

public class Problem3 {

	public int TrapRainWater(int arr[],int n) {
      List<Integer> storage = new ArrayList<Integer>();
      int max=arr[0];
      int diff=0;
      for(int i=0;i<arr.length;i++) {
    	  if(max>arr[i]) {
    		  diff=max-arr[i];
    		  storage.add(diff);
    	  }
    	  else {
    		  max=arr[i];
    	  }
    	  diff=0;
      }
      int result=0;
      for(int i=0;i<storage.size();i++) {
    	  result+=storage.get(i);
      }
      return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Problem3 p3 = new Problem3();
         int input[] = {3,0,0,2,0,4};
         System.out.println(p3.TrapRainWater(input, 6));
	}

}
