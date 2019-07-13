package easy;
import java.util.*;

public class FizzBuzz {

	public List<String> fizzBuzz(int n) {
	        List<String> res=new ArrayList<String>(n);
	        
	        for(int i=1;i<=n;i++){
	            res.add(Integer.toString(i));
	        }
	        for(int i=1;i<=res.size();i++){
	            if((i%3)==0)res.set(i,"Fizz");
	            else if((i%5)==0)res.set(i,"Buzz");
	            else if(((i%3)==0) && ((i%5)==0))res.set(i,"FizzBuzz");
	        }
	        return res;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fb = new FizzBuzz();
		fb.fizzBuzz(3);

	}

}
