package codingbat;
import java.util.*;

public class MoveZeroes {
    
	public int[] moveZeroes(int[] nums) {
        List<Integer> test = new ArrayList<Integer>();
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                test.add(nums[i]);
            }
            if(nums[i]==0)count++;
        }
     /*   for(int i=0;i<count;i++){
            test.add(0);
        } */
        nums =new int[test.size()];
        for(int i=0;i<nums.length;i++){
            nums[i]=test.get(i);
        }
        return nums;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroes mz = new MoveZeroes();
		int[] nums= {0,1,0,3,12};
		System.out.println(mz.moveZeroes(nums));

	}

}
