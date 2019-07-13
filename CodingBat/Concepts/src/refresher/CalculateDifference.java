package refresher;

public class CalculateDifference {

	int calculateDifference(int n){
	int diff=0,sumOfSquares=0,totalSum=0;
	  
	  for(int i=1;i<=n;i++){
		  sumOfSquares=sumOfSquares+(i*i);
		  totalSum=totalSum+i;
	  }
	  diff = sumOfSquares - (totalSum * totalSum);
	  return diff; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CalculateDifference cd = new CalculateDifference();
        System.out.println(cd.calculateDifference(2));
	}

}
