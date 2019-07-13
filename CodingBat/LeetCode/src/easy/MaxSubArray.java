package easy;

public class MaxSubArray {

    public int maxSubArrayLen(int[] nums, int k) {
        int outerCounter=0,innerCounter=0,finalCounter=0;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
           // outerCounter++;
            sum+=nums[i];
            for(int j=0; j<nums.length ; j++){
                {
                	if(j!=i){
                    innerCounter++;
                    sum+=nums[j];
                    if(sum==k){
                        finalCounter=innerCounter+1;
                     //   break;
                    }
                	}
                }
            }
        }
        return finalCounter;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           MaxSubArray ms = new MaxSubArray();
           int[] nums={1,-1,5,-2,3};
           System.out.println(ms.maxSubArrayLen(nums, 3));
	}

}
