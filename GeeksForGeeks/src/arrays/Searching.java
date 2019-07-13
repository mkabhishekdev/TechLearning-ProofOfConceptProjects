package arrays;

public class Searching {

	  static int search(int arr[], int n, int x)
	    {
	        int res=-1;
	        for(int i=0;i<n;i++){
	            if(arr[i]==x){
	                res=i;
	            }
	        }
	        return res;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//input: 79 50 68 71 73 31 81 30 33 94 60 63 99 81 99 96 59 73 13 68 90 95 26 66 84 40 90 84 76 42 36 7 45 56 79 18 87 12 48 72 59 9 36 10 42 87 6 1 13 72 21 55 19 99 21 4 39 11 40 67 5 28 27 50 84 58 20 24 22 69 96 81 30 84 92 72 72 50 25 85 22 99 40 42 98 13 98 90 24 90 9 81 19 36 32 55 94 4 79 69
// look for: 84 --> Output: 24(index value)