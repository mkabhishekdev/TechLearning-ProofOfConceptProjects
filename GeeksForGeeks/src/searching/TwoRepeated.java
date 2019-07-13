package searching;
import java.util.*;

public class TwoRepeated {

	static void twoRepeated(int arr[], int n){
        int count=0;
        List<Integer> store= new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    if(arr[j]==arr[i]){
                        count++;
                    }
                }
            }
            if(count>0){
                store.add(arr[i]);
            }
            count=0;
        }
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
