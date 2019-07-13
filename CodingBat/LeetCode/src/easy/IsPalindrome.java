package easy;

public class IsPalindrome {

    public boolean isPalindrome(String s) {
        String revMe="",inVal="",val="";
        
        for(int i=0;i<s.length();i++){
            inVal=s.substring(i,i+1);
            if(!inVal.equals(":")&&!inVal.equals(",")&&!inVal.equals(" ")){
            val=val+s.substring(i,i+1).toLowerCase();
            }
        }
        for(int i=val.length()-1;i>=0;i--){
        	revMe=revMe+val.substring(i,i+1).toLowerCase();
        }
       
        if(val.equals(revMe))return true;
        return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPalindrome ip =new IsPalindrome();
		System.out.println(ip.isPalindrome("A man, a plan, a canal: Panama"));

	}
}
