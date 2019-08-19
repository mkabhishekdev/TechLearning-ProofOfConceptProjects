package sorting;

public class QuickSort {

	public int partition(int arr[], int low, int high)
    {
        low=0;
        high=arr.length-1;
        int pivot=arr[low];
        int i=low,j=high;
        
        while(i<j){
        do{
        	i++;
        }while(arr[i]<=pivot);
        do{
        	j--;
        }while(arr[j]>pivot);
        if(i<j)swap(arr[i],arr[j]);
        }
        swap(arr[low],arr[j]);
        return j;
    } 

	public void swap(int val1,int val2){
		int temp;
		temp=val1;
		val1=val2;
		val2=temp;
	}
	
	public static void main(String[] args) {
	
       int input[] = {10,16,8,12,15,6,3,9,5};
       QuickSort qs = new QuickSort();
        
       
	}

}
