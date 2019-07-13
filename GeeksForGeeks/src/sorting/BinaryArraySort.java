package sorting;

public class BinaryArraySort {

	static boolean binSort(int arr[], int n)
    {
	   boolean res=true;
       int temp=0;
       
       for(int i=0;i<n-1;i++){
           if(arr[i+1]<arr[i]){
               temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
           }
       }
       return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryArraySort x = new BinaryArraySort();
		int test[]={1,0,1,1,0};
	    System.out.println(x.binSort(test,5));	

	}
}
