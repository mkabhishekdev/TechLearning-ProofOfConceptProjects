package codingbat;

public class CountEnd {

	public int countYZ(String str) {
		 int count=0,countInner=0;
		 String firstStr="",secondStr="";
		 
		 String[] strSplit = str.split("[^\\w']+"); // to split a string in java on any non-alphanumeric characters
		 if(strSplit.length == 1){
			 String test = strSplit[0];
			// if(test.endsWith("y")||test.endsWith("z"))countInner=1;
			 for(int i=0; i<test.length() ; i++){
				 if(Character.isLetter(test.charAt(i))==false){
					 String innerTest = str.substring(i-1,i);
					 if(innerTest.equals("z")||innerTest.equals("y"))countInner++;
				 }
			 }
			 count=countInner;
		 }
		 for(int i=0; i<strSplit.length ; i++){
			 String check=strSplit[i];
			 if((check.endsWith("z")) || (check.endsWith("y")) || (check.endsWith("Z"))|| (check.endsWith("Y"))){
				 count++;
			 }
		 }
		 if(count==0)count=0;
		 return count;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CountEnd ce = new CountEnd();
        int result=0;
        result=ce.countYZ("y2bz");
        System.out.println(result);
	}

}

/*  for(int i=0;i<str.length();i++){
		   if(Character.isLetter(str.charAt(i))==false){
		     firstStr=str.substring(i-1,i);
		     secondStr = str.substring(str.length()-1,str.length());
		     if((firstStr.equals("z")||firstStr.equals("y")) && (secondStr.equals("z")||secondStr.equals("y"))){
		       count2=count2+2;
		       count=count2;
		     }
		     else if((firstStr.equals("z")||firstStr.equals("y")) || (secondStr.equals("z")||secondStr.equals("y"))){ 
		    	 count1++;
		    	 count=count1;}
		   }
		 } */