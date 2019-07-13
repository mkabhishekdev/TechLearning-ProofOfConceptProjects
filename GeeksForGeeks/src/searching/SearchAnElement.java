package searching;

public class SearchAnElement {
	 
	static int search(int arr[], int n, int x)
	    {
	        int res=-1;
	        
	        for(int i=0;i<arr.length;i++){
	            if(x==arr[i])
	            {
	            	  res=i;
	                  break;
	            }
	            continue;
	        }
	        return res;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SearchAnElement x = new SearchAnElement();
       int test[] = {86,77,15,93,35,86,92,49,21,62,27,90,59,63,26,40,26,72,36,11,68,67,29,82,30,62,23,67,35,29,2,22,58,69,67, 93, 56, 11, 42, 29, 73, 21, 19, 84, 37, 98, 24, 15, 70, 13, 26, 91, 80, 56, 73, 62, 70, 96, 81, 5, 25, 84, 27, 36, 5, 46, 29, 13, 57, 24, 95, 82, 45, 14, 67, 34, 64, 43, 50, 87, 8, 76, 78, 88,25};
       System.out.println(x.search(test, 84, 25));
	}

}
