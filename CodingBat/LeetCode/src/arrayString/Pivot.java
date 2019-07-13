package arrayString;

public class Pivot {

    public int pivotIndex(int[] nums) {
        int maxLength=nums.length,leftSum=0,rightSum=0,res=-1,j;
        
        for(int i=1;i<nums.length;i++){
            int val=i;
          
            if((val-1)==0)leftSum=nums[0];
            else{
            for(j=val-1;j>=0;j--){
                leftSum+=nums[j];
            }
            }
            for(int k=val+1;k<maxLength;k++){
                rightSum+=nums[k];
            }
            if(leftSum==rightSum){
                res=val;
                break;
            }
            leftSum=0;
            rightSum=0;
      
        }
        return res;
    }
    
	public static void main(String[] args) {
		  Pivot pv = new Pivot();
		  int[] check={1,7,3,6,5,6};
          System.out.println(pv.pivotIndex(check));
	}

}
