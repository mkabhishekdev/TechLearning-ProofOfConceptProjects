package codingbat;

public class Lucky13 {
	
	public boolean lucky13(int[] nums) {
		  boolean result=false;
		  for(int i=0;i<nums.length-1;i++){
		    if(nums[i]!=1 && nums[i]!=3){
		    	
		      for(int j=i+1;j<nums.length-1;j++){
		    	  if(nums[j]!=1 && nums[j]!=3){
		    		  result=true;
		    	  }
		      }
		    }
		  }
		  return result;
		}

	public static void main(String[] args) {
		Lucky13 l = new Lucky13();
		int[] nums={1,2,3,4,5};
		l.lucky13(nums);

	}

}
