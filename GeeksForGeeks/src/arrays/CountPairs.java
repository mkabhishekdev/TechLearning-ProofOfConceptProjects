package arrays;

public class CountPairs {

	public int countSum(int[] input,int K){
		int count=0;
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
				if((input[i]+input[j])==K){
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CountPairs cp = new CountPairs();
       int[] val = {1,1,1,1};
       System.out.println(cp.countSum(val,2));
	}

}
