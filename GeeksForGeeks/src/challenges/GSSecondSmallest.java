package challenges;

public class GSSecondSmallest {

	public int SecondSmallest(int[] input){
		int low=input[0],sLow=input[0];
		
		for(int i=0;i<input.length;i++){
			if(input[i]<low){
				low=input[i];
			}
		}
		for(int i=0;i<input.length;i++){
			if((input[i]<sLow) && (input[i]!=low)){ //I was doing sLow!=low instead of input[i]!=low 
				sLow=input[i];
			}
		}
		return sLow;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GSSecondSmallest gs = new GSSecondSmallest();
        int[] test = {5,3,7,1,2};
        System.out.println(gs.SecondSmallest(test));
	}

}
