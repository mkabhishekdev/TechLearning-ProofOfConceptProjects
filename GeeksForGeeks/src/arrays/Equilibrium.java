package arrays;

public class Equilibrium {

	  public int equilibriumPoint(long arr[], int n){
	        int i,j;
	        int leftSum,rightSum;
	        
	        for(i=0;i<n;i++){
	            leftSum=0;
	            for(j=0;j<i;j++){
	                leftSum+=arr[j];
	            }
	            rightSum=0;
	            for(j=i+1;j<n;j++){
	                rightSum+=arr[j];
	            }
	            if(leftSum==rightSum)return i;
	        }
	        return -1;
	    }
	  
	public static void main(String[] args) {
		 Equilibrium eb = new Equilibrium();
		 long test[] = {1,3,5,2,2};
         System.out.println(eb.equilibriumPoint(test, 5));
	}

}
