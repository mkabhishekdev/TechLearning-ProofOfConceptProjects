package codingbat;
/* 
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case 
differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version 
of a string
endOther("Hiabc", "abc") → true
endOther("Hiabc", "bc") → true

*/

public class EndOther {

	public boolean endOther(String a, String b) {
		  boolean result = false;
		  String x=a.toLowerCase(); 
		  String y=b.toLowerCase(); 
		  int aSize = a.length(); 
		  int bSize = b.length(); 
		  if(aSize>bSize){ 
		   int z = y.length(); // you found this part to subtract based on the count of other string & not hardcoding number
		    if(x.substring(aSize-z,aSize).equals(y)){ 
		      result =true;
		    }
		    else{
		      result = false;
		    }
		  }
		  else{
		    int z=x.length(); // you found this part to subtract based on the count of other string & not hardcoding number
		    if(y.substring(bSize-z,bSize).equals(x)){
		      result =true;
		    }
		    else{
		      result = false;
		    }
		  }
		  return result;
		}
	
	public static void main(String[] args) {
		EndOther eo = new EndOther();
       boolean b = eo.endOther("Hiabc","abc");		
       System.out.println(eo.endOther("Hiabc","abc"));
     
	}

}
