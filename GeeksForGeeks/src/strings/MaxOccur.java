package strings;
import java.util.*;
import java.util.Map.Entry;

public class MaxOccur {

   public static void getMaxOccuringChar(String line){
	        Map<String,Integer> val = new HashMap<String,Integer>();
	        int count=0;
	        for(int i=0;i<line.length();i++){
	            for(int j=0;j<line.length();j++){
	                if(j!=i){
	                    if(line.substring(i,i+1).equals(line.substring(j,j+1))){
	                      count++;    
	                    }
	                }   
	              }
	              val.put(line.substring(i,i+1),count);
	              count=0;
	        }
	        List<String> t = new ArrayList<String>();
	        int maxValueInMap=(Collections.max(val.values()));
	        for(Entry<String, Integer> entry:val.entrySet()){
	        	if(entry.getValue()==maxValueInMap){
	        		//System.out.println(entry.getKey());
	        		t.add(entry.getKey());
	        	}
	        }
	        Object[] arr=t.toArray();
	        Arrays.sort(arr);
	        System.out.println(arr[0]);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MaxOccur mo = new MaxOccur();
      mo.getMaxOccuringChar("output");
	}

}
