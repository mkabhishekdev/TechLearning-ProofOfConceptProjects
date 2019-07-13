package easy;

public class ToLower {

    public String toLowerCase(String str) {
        String result="";
        StringBuilder sb = new StringBuilder();
        
        for(char c:str.toCharArray()){
        	 if(c>=65 && c<91){
        		 c  = (char)(c+32);
        	 }
        	 sb.append(c);
        }
        
        return sb.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	}
	

}
