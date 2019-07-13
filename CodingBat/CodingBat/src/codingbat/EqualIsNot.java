package codingbat;

public class EqualIsNot {

	public boolean equalIsNot(String str) {
		  int countIs=0, countNot=0;
		  int len=str.length();
		  if(str.isEmpty())return true;
		  for(int i=0;i<str.length()-2;i++){
		    if(str.substring(i,i+2).equals("is"))countIs++;
		  }
		  for(int i=0;i<str.length()-3;i++){
		    if(str.substring(i,i+3).equals("not"))countNot++;
		  }
		  if(str.substring(len-2,len).equals("is"))countIs++;
		  if(str.substring(len-3, len).equals("not"))countNot++;
		  
		  if(countIs==countNot)return true;
		  else return false;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EqualIsNot en = new EqualIsNot();
       en.equalIsNot("isisnotnot");
	}

}
