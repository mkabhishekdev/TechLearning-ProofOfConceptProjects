package microsoftLeetCode;

public class ValidPalindrome {

	  public boolean isPalindrome(String s) {
	         boolean res=false;
	         String newVal="",convVal="";
	         
	         if(s.equals(""))res=true;
	         s=s.replaceAll("[^a-zA-Z0-9]","");
	         s=s.replaceAll("\\s","");
	         convVal=s;
	         for(int i=s.length()-1;i>=0;i--){
	             newVal+=s.substring(i,i+1);    
	         }
	         if(newVal.equalsIgnoreCase(convVal))res=true;
	         else res=false;
	         return res;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.isPalindrome("race a car"));

	}

}
