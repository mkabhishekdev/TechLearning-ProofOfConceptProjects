package easy;
import java.util.*;

public class ProdOfArray {

	public int[] productExceptSelf(int[] nums) {
	        List<Integer> test = new ArrayList<Integer>();
	        int prod=1;
	        
	        if(nums.length==2){
	           test.add(nums[1]);
	           test.add(nums[0]);
	        }
	        else{
	        for(int i=0;i<nums.length;i++){
	            for(int j=0;j<nums.length;j++){
	              if(j!=i){
	              prod=prod*nums[j];
	              }
	            }
	            test.add(prod);
	            prod=1;
	        }
	        }
	      //res=Ints.toArray(test);
	        int[] res=new int[test.size()];
	        for(int i=0;i<res.length;i++){
	            res[i]=test.get(i);
	        }
	        return res;
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		ProdOfArray poa = new ProdOfArray();
        int[] nums={1,2,3,4};
        System.out.println(poa.productExceptSelf(nums));
	}

}
