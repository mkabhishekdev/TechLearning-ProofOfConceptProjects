package easy;

public class UniqueValue {

	   public int firstUniqChar(String s) {
	        int res=0,count=0;
	        
	        for(int i=0;i<s.length();i++){
	        	count=0;
	            for(int j=0 ;j<s.length();j++){
	            	if(j!=i){
	                if(s.substring(i,i+1).equals(s.substring(j,j+1))){
	                    count++;
	                }
	            	}
	        }
	         if(count==0){
	                res=i;
	                break;}
	        }
	        return res;
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueValue uv = new UniqueValue();
		System.out.println(uv.firstUniqChar("aadadaad"));

	}

}
