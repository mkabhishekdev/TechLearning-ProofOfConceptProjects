package sorting;

public class QuickSort {

	public int[] sortMe(int[] test){
		int pivot=test[0];
		int res[]={};
		for(int i=test.length;i>=1;i--){
			if(pivot>test[i]){
		      test[i]=pivot;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int input[] = {3,0,1,8,7,2,5,4,9,6};
       
	}

}
