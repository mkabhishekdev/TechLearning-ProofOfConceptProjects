package searching;

public class FindFloor {

	static int findFloor(int arr[], int left, int right, int x)
    {
        //1,2,8,10,11,12,19
        int index=-1;
        if(x>arr[arr.length-1]){
        	index=arr.length-1;
        }
        else{
        while(left<=right){
            int mid=(left+right)/2;
            if(x<arr[mid]){
                right=mid-1;
            }
            else if(x>arr[mid]){
                left=mid+1;
            }
            else if(x==arr[mid]){
            	index=mid;
            	break;
            }
            else{
                index=mid-1;
                break;
            }
        }
        }
        return index;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFloor ff =new FindFloor();
		int test[]={66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130
};
		System.out.println(ff.findFloor(test, 0, test.length-1, 106));

	}

}
