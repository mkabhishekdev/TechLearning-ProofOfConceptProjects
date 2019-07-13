package easy;
import java.util.*;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        HashMap<String,Integer> sCheck = new HashMap<String,Integer>();
        HashMap<String,Integer> tCheck = new HashMap<String,Integer>();
        int count=1;
         
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
            	if(j!=i){
                if(s.substring(i,i+1).equals(s.substring(j,j+1))){
                    count++;
                }
            	}
            }
            sCheck.put(s.substring(i,i+1),count);
            count=1;
        }  
        for(int i=0;i<t.length();i++){
            for(int j=0;j<t.length();j++){
                if(j!=i){
            	if(t.substring(i,i+1).equals(t.substring(j,j+1))){
                    count++;
                }
                }
            }
            tCheck.put(t.substring(i,i+1),count);
            count=1;
        }
        if(sCheck.equals(tCheck))return true;
        return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IsAnagram is = new IsAnagram();
       System.out.println(is.isAnagram("anagram","agaram"));
	}

}
