package searching;

import java.util.Arrays;

//import java.util.*;

public class Problem1 {

	String RepeatingMissing(int[] test){
		int countTwice=0,valMiss=-1;
		String res="";
		Arrays.sort(test); //1,2,2,3,5
		for(int i=0;i<test.length;i++){
		  int nextVal=i+1;
		  for(int j=0;j<test.length;j++){
			  if(j!=i){
			  if(test[i]==test[j])countTwice++;
			  }
		  }
		  if(countTwice>=1){
			  System.out.println("Found twice occuring value:"+test[i]);
		  }
		  countTwice=0;
		  if(test[i+1]!=nextVal && test[i+1]!=test[i]){
			  System.out.println("Found missing:"+nextVal);
		  }
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] input={2,3,2,1,5};
        Problem1 p1 = new Problem1();
        System.out.println(p1.RepeatingMissing(input));
	}

}
