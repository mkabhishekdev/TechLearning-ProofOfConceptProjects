package codingbat;

public class XyzMiddle {
   
	public boolean xyzMiddle(String str) {
		  boolean result=false;
		  for(int i=0;i<str.length()-3;i++){
		    if(str.substring(i,i+3).equals("xyz")){
		      String rightSide=str.substring(i+3,str.length());
		      int rightLength=rightSide.length();
		      String leftSide=str.substring(0,i);
		      int leftLength=leftSide.length();
		      int diff=Math.abs(rightLength-leftLength);
		      if(diff>=0 && diff<=1)result=true;
		      else result=false;
		    }
		  }
		  return result;
		}
	
	public static void main(String[] args) {
		XyzMiddle test = new XyzMiddle();
		boolean result=test.xyzMiddle("xyzxyzAxyzBxyzxyz");
        System.out.println(result);
	}

}
