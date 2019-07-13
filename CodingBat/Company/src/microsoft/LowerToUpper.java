package microsoft;


public class LowerToUpper {

	public String lowerToUpper(String str){
		String result="";

		for(int i=0;i<str.length();i++){
			result += str.substring(i,i+1).toUpperCase(); 
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LowerToUpper ltp = new LowerToUpper();
          System.out.println(ltp.lowerToUpper("1x6xy"));
	}

}
