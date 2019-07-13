package microsoft;
import java.util.*;

public class GetSquares {

	HashMap<Integer,Integer> getSquares(int[] numbers){
	 	 HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
	 	 
	 	 for(int i=0;i<numbers.length;i++){
	 		 result.put(numbers[i],numbers[i]*numbers[i]);
	 	 }
	 	 
	 	 return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GetSquares gs = new GetSquares();
		 
         int[] test = {2,4,5,8};
         System.out.println(gs.getSquares(test));
	}

}
