package strings;

public class NonRepeatingCharacter {

	static char nonrepeatingCharacter(String S)
	    {
	        int count=0;
	        char check='\u0000';
	        for(int i=0;i<S.length();i++) {
	        	check = S.charAt(i);
	        	for(int j=i+1;j<S.length();j++) {
	        		if(check==S.charAt(j)) {
	        			count++;
	        		}
	        	}
	        	if(count==0)break;
	        	count=0;
	        }
	        return check;
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          NonRepeatingCharacter nr = new NonRepeatingCharacter();
          System.out.println(nr.nonrepeatingCharacter("xxyyzz"));
	}

}
