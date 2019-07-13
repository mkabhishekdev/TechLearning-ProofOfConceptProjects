package easy;
import java.util.*;

public class UniqueMorseWords {

	    public int uniqueMorseRepresentations(String[] words) {
	        String innerRes="";
	        HashMap<String,String> hm = new HashMap<String,String>();
	        TreeSet<String> ts = new TreeSet<String>();
	        
	        hm.put("a",".-");
	        hm.put("b","-...");
	        hm.put("c","-.-.");
	        hm.put("d","-..");
	        hm.put("e",".");
	        hm.put("f","..-.");
	        hm.put("g","--.");
	        hm.put("h","....");
	        hm.put("i","..");
	        hm.put("j",".---");  
	        hm.put("k","-.-");
	        hm.put("l",".-..");
	        hm.put("m","--");
	        hm.put("n","-.");
	        hm.put("o","---");
	        hm.put("p",".--.");
	        hm.put("q","--.-");
	        hm.put("r",".-.");  
	        hm.put("s","...");
	        hm.put("t","-");
	        hm.put("u","..-");
	        hm.put("v","...-");
	        hm.put("w",".--");
	        hm.put("x","-..-");
	        hm.put("y","-.--");
	        hm.put("z","--..");
	        for(int i=0; i<words.length ; i++){
	            String val = words[i];
	            for(int j=0;j<val.length();j++){
	                String alp = val.substring(j,j+1);
	                innerRes += hm.get(alp);
	            }
	            ts.add(innerRes);
	            innerRes="";
	        }       
	        return ts.size();
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueMorseWords umw = new UniqueMorseWords();
		String[] values={"gin","zen","gig","msg"};
		
	    System.out.println(umw.uniqueMorseRepresentations(values));
	}

}
