package microsoft;
import java.util.*;
/* Create a method which accepts an integer array, reverse the numbers in the array and
returns the resulting array in sorted order */
public class GetSorted {

	public int[] getSorted(int[] check){

		ArrayList<Integer> test = new ArrayList<Integer>();
		
		for(int i=0; i<check.length ; i++){
			String conv = Integer.toString(check[i]);     
			String now = new StringBuffer(conv).reverse().toString();
			test.add(Integer.parseInt(now));
		}
		Collections.sort(test);
		int[] result=new int[test.size()];
		for(int i=0; i<test.size() ; i++){
			if(test.get(i)!=null){
				result[i] = test.get(i);
			}
		}
		System.out.println( Arrays.toString(result)); //to print int[] , use Arrays.toString(result)
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GetSorted gs = new GetSorted();
        
		int[] val = {34,65,88,32};
		System.out.println(gs.getSorted(val));
	}

}
