package codingbat;

    /* Google university practice question */
public class Palindrome {

	public boolean PalindromeTest(String str){
		boolean result = false;
		StringBuffer sb = new StringBuffer();
		for(int i=str.length()-1; i>=0 ; i--){
			sb.append(str.charAt(i));
		}
		String test = sb.toString();
		if(test.equals(str))result = true;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Palindrome pa = new Palindrome();
		 System.out.println(pa.PalindromeTest("madam"));

	}

}
 // Start thinking about how to answer Time & Space complexity questions