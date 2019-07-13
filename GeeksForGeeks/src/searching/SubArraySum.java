package searching;

public class SubArraySum {

   static boolean subarraySum(int n, int s, int[] m) {
	        boolean res=false;
	        int sumVal=0;        
	        for(int i=0;i<n;i++){
	            sumVal=m[i];
	            for(int j=i+1;j<n;j++){
	                sumVal+=m[j];
	                if((sumVal==s)&&(res==false)){
		                System.out.println(i+1);
		                System.out.println(j+1);
		                res=true;
		            }
	            }
	            sumVal=0;
	        }
	        return res;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SubArraySum sa = new SubArraySum();
        int test[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sa.subarraySum(10, 15, test));
	}

}
