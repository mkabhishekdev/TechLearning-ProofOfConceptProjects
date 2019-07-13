package refresher;
import java.util.*;

public class GetSecondSmallest {

	int getSecondSmallest(int[] test){
       List<Integer> check = new ArrayList<Integer>();
       
       for(int i=0;i<test.length;i++){
    	   check.add(test[i]);
       }
       Collections.sort(check);
       return check.get(1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GetSecondSmallest val = new GetSecondSmallest();
        int[] input = {3,5,7,8,4};
        System.out.println(val.getSecondSmallest(input));
	}

}
