package sorting;

public class InsertionSort {

	public int[] insert(int arr[])
	{
	   int key;
	   int start=arr[0];
	   for(int i=1;i<arr.length;i++){
		   if(arr[0]>arr[i]){
			   
		   }
	   } 
	   return arr;
	}
	
	public void swap(int x, int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        InsertionSort is = new InsertionSort();
        int[] input={4,1,3,9,7};
        is.insert(input);
	}

}
