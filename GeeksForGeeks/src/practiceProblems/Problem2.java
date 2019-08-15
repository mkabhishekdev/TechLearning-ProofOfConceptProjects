package practiceProblems;

public class Problem2 {

	public boolean search(String pat, String txt)
	    {
		   boolean res=false;
	        int patSize = pat.length();
	        
	        for(int i=0;i<=txt.length()-patSize;i++) {
	        	String checkSub = txt.substring(i,i+patSize);
	        	if(pat.equals(checkSub))res=true;
	        }
	        return res;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Problem2 result = new Problem2();
           System.out.println(result.search("ahf","lkjsdfhaiuehaoewiuraoikdehjakdsfhlsjdkihalieushralkehfailuewhfaklfjsdhfliuewahf"));
	}

}
