package refresher;
import java.util.*;

public class CheckNumber {

	
   boolean checkNumber(int number){
	   boolean test = true;
	   String check = Integer.toString(number);
	   List<String> myCheck = new ArrayList<String>();
	   for(int i=0;i<check.length();i++){
		   myCheck.add(check.substring(i,i+1));
	   }
	   for(int i=0;i<myCheck.size()-1;i++){
		   System.out.println(myCheck.get(i));
		   if(Integer.parseInt(myCheck.get(i+1)) < Integer.parseInt(myCheck.get(i))){
			   test=false;
			   break;
		   }
	   }
	   return test;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CheckNumber cn = new CheckNumber();
      System.out.println(cn.checkNumber(13268));
	}

}
