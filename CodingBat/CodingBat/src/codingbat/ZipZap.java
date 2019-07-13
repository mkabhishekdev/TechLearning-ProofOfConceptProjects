package codingbat;

public class ZipZap {

	public String zipZap(String str) {
		String innerRes="", val="";

		if(str.length()<3)return str;
		for(int i=0;i<str.length();i++){
		  if(str.substring(i,i+1).equals("z") && str.substring(i+2,i+3).equals("p")){
		    innerRes = innerRes + str.substring(i,i+1) + str.substring(i+2,i+3);
		 /*   if(!str.substring(i+3,i+4).equals("z")){
		      val = str.substring(i+3,i+4);
		      innerRes = innerRes + val;
		    }*/
		  }
		}

		return innerRes;
		}
	
	public static void main(String[] args) {
	 
	   String str = "zipzap"; 	
		
	   ZipZap zp = new ZipZap();
	   String res  = zp.zipZap(str);
	   
	   System.out.println(res);

	}

}
