package codingbat;

public class IsEveryWhere {

	public boolean IsEverywhere(int[] nums, int val) {
		  boolean result=false;
		  int count=0,check=0;
		  
		  for(int i=0;i<nums.length-1;i++){
		    if(nums[i]==val || nums[i+1]==val)count++;
		  }
		  
		  check=nums.length/2;
		  check=check+1;
		  
		  if(check==count)result=true;
		  else result=false;
		  
		  return result;
		}
	
	public static void main(String[] args) {
		int[] nums={1,2,1,3,4};
		IsEveryWhere test = new IsEveryWhere();
		System.out.println(test.IsEverywhere(nums,1));
		
	}

}
