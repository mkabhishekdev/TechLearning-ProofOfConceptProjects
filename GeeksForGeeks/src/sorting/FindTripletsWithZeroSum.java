package sorting;

public class FindTripletsWithZeroSum {

	public boolean findTriplets(int arr[] , int n)
    {
        boolean res=false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=i+2;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        res=true;
                        break;
                    }
                }
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FindTripletsWithZeroSum x = new FindTripletsWithZeroSum();
        //failing for the below test case
        //6 56 93 -12 26 78 79 58 53 52 51 55 77 -2 61 -26 91 16 100 -8 72
	}

}
