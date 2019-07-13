package refresher;
import java.util.*;

public class GetImage {
StringBuffer sb=new StringBuffer();

	String getImage(String s){
		String res="";
		
		sb.append(s);
		res = s + "|" + sb.reverse().toString();
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          GetImage gi = new GetImage();
          System.out.println(gi.getImage("EARTH"));
	}

}
