package easy;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int count=0,res=0;
         
         for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
            	if(j!=i){
                if(nums[i]==nums[j])count++;
            	}
            }
            if(count==0){
                res=nums[i];
                break;
                }
            count=0;
        }
         return res;
     }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums={4,1,2,1,2};
		SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(nums));
	}

}
