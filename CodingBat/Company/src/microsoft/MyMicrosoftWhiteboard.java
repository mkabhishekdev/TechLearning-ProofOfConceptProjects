package microsoft;

/*
 int convertToBase(String str, int base)
 Input: 123, 10 = 123
 Input: 123, 4 = 27
 123,10 = 1*10(power of 2) + 2*10(power of 1) + 3*10(power of 0) = 100 + 20 + 3 = 123
 HINT: Convert to character, think about ASCII
 - WANTED TO ANALYZE, HOW WELL YOU WORK WITH LOW-LEVEL CONCEPTS LIKE Binary values, bits, bytes, ascii storage
 */
public class MyMicrosoftWhiteboard {

	public int convertToBase(String str, int base){
		int result = 0, updatedBase=0, prod;
		int sum=0;
        String myStr="";
        for(int i=str.length()-1;i>=0;i--){
        	myStr += str.substring(i,i+1);
        }
		int strSize = str.length();
		for(int i=strSize-1;i>=0;i--){
			String check = myStr.substring(i,i+1);
			int val = Integer.parseInt(check);
		    int baseCount = i; //2
		    prod=1;
		    if(baseCount==0){
		    	prod = 1;
		    }
		    for(int j=1; j<=baseCount; j++){
		    	prod = base * prod;	    
		    }
			sum += val*prod;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMicrosoftWhiteboard mb = new MyMicrosoftWhiteboard();
		System.out.println(mb.convertToBase("1234", 10));
	}

}

/*
Behavioral: Explain from your experience, where you went wrong with the Design of a project?
 - Did not give a satisfactory answer
*/