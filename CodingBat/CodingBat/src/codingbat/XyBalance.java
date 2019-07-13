package codingbat;
                                     //SOlVED
public class XyBalance {

	public boolean xyBalance(String str) {
		  boolean result=false;
		  int xIndex=0,yIndex=0;
		  if(str.contains("x")==false || str.contains("y")==false)result=true; //'contains' will return a boolean, can be used to check substring occurence
		  if(str.length()<2)result=false;
		  for(int i=0;i<str.length();i++){ //this logic helps to get the last occurrence of 'x' & 'y' in the string
		    if(str.charAt(i)=='x')xIndex=i;
		    if(str.charAt(i)=='y')yIndex=i;
		  }
		  if(str.equals("y")||str.equals(""))result=true; 
		    if(yIndex>xIndex){
		      for(int i=0;i<str.length();i++){
		        if(str.charAt(i)=='x'){
		          for(int j=i+1;j<str.length();j++){
		            if(str.charAt(j)=='y')result=true;
		          }
		        }
		      }
		    }
		    if(yIndex<xIndex)result=false;
		    
		  return result;
		}
	
	public static void main(String[] args) {
		XyBalance result =  new XyBalance();
		System.out.println(result.xyBalance("aaxbby"));

	}

}



 

 
 