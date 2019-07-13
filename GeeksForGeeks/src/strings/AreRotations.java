package strings;

public class AreRotations {

	boolean areRotations(String s, String x )
	    {
	        String check=x.substring(0,1);
	        int index=-1;
	        for(int i=0;i<s.length()-1;i++){
	            if(s.substring(i,i+1).equals(check)){
	                index=i;
	            }
	        }
	        String search=s.substring(index,s.length()) + s.substring(0,index);
	        if(search.equals(x))return true;
	        else return false;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AreRotations ar = new AreRotations();
        System.out.println(ar.areRotations("mightandmagic","andmagicmigth"));
	}

}
