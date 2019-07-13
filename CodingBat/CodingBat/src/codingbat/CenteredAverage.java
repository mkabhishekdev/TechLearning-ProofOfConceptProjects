package codingbat;

public class CenteredAverage {

	public int centeredAverage(int[] nums) {
		int max=0,min=0;
		if(nums[0]!=nums[1]){ 
		  max = Math.max(nums[0],nums[1]);
		  min = Math.min(nums[0],nums[1]);
		}
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]>max){
		      max=nums[i];
		    }
		  }
		  min = max;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]<min){
		      min=nums[i];
		    }
		  }
		  int sum=0,avg=0;
		  if(nums.length>3){
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]!=max && nums[i]!=min){
		      sum = sum+nums[i];
		    }
		  }
		  }
		  else{
		    if(nums[1]==0){
		      sum=nums[0];
		    }
		    else{
		    sum = nums[1];
		    }
		  }
		  avg=sum/(nums.length-2);
		  return avg;
		}

	public static void main(String[] args) {
		CenteredAverage result = new CenteredAverage();
		int[] nums = {1, 1, 99, 99};
   	    int x = result.centeredAverage(nums);
       System.out.println(x);
     
	}

}
