package arrays;
import java.util.*;

public class RearrangeArray {

	public boolean arrange(long arr[], int n)
	    {
	        boolean res=true;
	        long check[] = arr;
	
	        for(int i=0;i<check.length;i++){
	          arr[i]=check[(int)check[i]];
	        }
	        return res;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       RearrangeArray ra = new RearrangeArray();
       long test[] = {4,0,2,1,3};
       System.out.println(ra.arrange(test,5));
	}

}
