package geeks;

import java.util.Arrays;

public class ArrayReversal {

	 public static void arrayReversal(int arr[],int sizeOfArray) 
	    {
	       int test[]=new int[28123];
	       int x=0;
	       test=arr;
	       for(int i=sizeOfArray-1;i>=0;i--){
	           arr[x]=test[i];
	           x++;
	       }
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayReversal ar = new ArrayReversal();
         int arr[]={1,2,3,4,5,6};
         ar.arrayReversal(arr,6);
	}

}
