package easy;

public class KthLargest {

    public int findKthLargest(int[] nums, int k) {
        int total=0;
        
        if(k==1)total=maxK(nums);
        else{
         total=maxK(nums);
         if(--k!=0){
          //  --k;
            total = maxK(nums);
         }
        }
        return total;
    }
    
    private int maxK(int[] nums){
        int res=nums[0];
        int store=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>res){
                res=nums[i];
                store=i;
            }
        }
        nums[store]=0;
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        KthLargest kl = new KthLargest();
        int nums[]={3,2,1,5,6,4};
        System.out.println(kl.findKthLargest(nums, 2));
	}

}
