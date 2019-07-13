package microsoft;

public class Palindrome {

	public Boolean checkPalindrome(String str){
		String onReverse="";
		Boolean test = false;
		
		for(int i=str.length()-1; i>=0 ; i--){
			onReverse += str.substring(i,i+1);
		}
		System.out.println(onReverse);
		if(str.equals(onReverse))test=true;
		return test;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Palindrome pdm = new Palindrome();
        System.out.println(pdm.checkPalindrome("andna"));
	}

}

//kayak,kayak