package strings;
import java.util.*;

public class RepeatedCharacter {

	 int repeatedCharacter(String S)
	    {
	      int res=-1;
	      List<String> l = new ArrayList<String>();
	      for(int i=0;i<S.length();i++){
	          for(int j=0;j<S.length();j++){
	              if(j!=i){
	                  if(S.substring(i,i+1).equals(S.substring(j,j+1))){
	                      l.add(S.substring(i,i+1));
	                  }
	              }
	          }
	      }
	      if(l.size()>0){
	      String check=l.get(0);
	      for(int i=0;i<S.length();i++){
	          if(check.equals(S.substring(i,i+1))){
	              res=i;
	              break;
	          }
	      }
	      }
	      return res;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          RepeatedCharacter rc = new RepeatedCharacter();
          System.out.println(rc.repeatedCharacter("abcd"));
	}

}
