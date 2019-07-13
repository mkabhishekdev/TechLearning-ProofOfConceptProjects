package searching;

import java.util.Arrays;

public class BinarySearch {

	public int doSearch(int input[],int key){
	  int low=0,high=input.length-1,index=-1;
	  
	  while(low<=high){
		  int mid=(low+high)/2;
		  if(key==input[mid]){
			  index=mid;
			  break;
		  }
		  else if(key<input[mid]){
			  high=mid-1;
		  }
		  else{
			  low=mid+1;
		  }
	  }
	  return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BinarySearch bs = new BinarySearch();
       int test[]={18,21,23,45,34,42,11};
       Arrays.sort(test);
       System.out.println(bs.doSearch(test,21));
	}

}
