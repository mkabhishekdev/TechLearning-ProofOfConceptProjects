package codingbat;
import java.util.*;

public class StarOut {

	public String starOut(String str) {
		  String result="",removeValue="";
		  int starIndex=0;
		  List<String> storage = new ArrayList<String>();
		  for(int i=0;i<str.length();i++){
			  if(str.charAt(i)=='*'){
				  removeValue=str.substring(i-1,i+2);
				  storage.add(removeValue);
			  }
		  }
		  return result;
		}
	
	
	public static void main(String[] args) {
		

	}

}

// sm*eil*ly -> siy