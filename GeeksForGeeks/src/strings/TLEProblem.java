package strings;

public class TLEProblem {

	/*This is a function problem.You only need to complete the function given below*/
	/*
	the function returns the 
	position where the target string 
	matches the string str
	Your are required to complete this method */
	class GfG
	{
	    int strstr(String str, String target)
	    {
	      int chkSize=target.length();
	      int s=str.length();
	      for(int i=0;i<=s-chkSize;i++){
	          if(str.substring(i,chkSize+i).equals(target)){ //doing "chkSize+i" better than "i+chkSize"
	              return i;
	          }
	      }
	      return -1;  //returning direct values instead of storing in variables sometimes help
	    }
	}
}
