package starProblems;

public class NegVal {

	 public int solution(int[] A) {
	       int res=1,send;
	       for(int i=0;i<A.length;i++){
	            res*=A[i]; 
	       }
	       String check=Integer.toString(res);
	       if(check.substring(0,1).equals("-")){
	          send=-1;   
	       }
	       else if(res==0){
	           send=0;
	       }
	       else{
	           send=1;
	       }
	       return send;
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          NegVal nv = new NegVal();
          int[] input={1,-2,-3,-5};
          System.out.println(nv.solution(input));
	}

}
