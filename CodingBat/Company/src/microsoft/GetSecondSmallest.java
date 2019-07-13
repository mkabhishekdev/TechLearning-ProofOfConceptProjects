package microsoft;
import java.util.*;

public class GetSecondSmallest {

	public int getSecondSmallest(int[] test){
		int result=0;
		
		List<Integer> check = new ArrayList<Integer>();
		for(int i=0;i<test.length; i++){
			check.add(test[i]);
		}
		Collections.sort(check);
		result = check.get(1);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSecondSmallest gss = new GetSecondSmallest();
        int[] val = {50,30,20,10};
        
		System.out.println(gss.getSecondSmallest(val));
	}

}
