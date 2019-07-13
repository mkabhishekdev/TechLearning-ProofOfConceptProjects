package arrays;
import java.util.*;

public class Missing {

	public int missingNumber(int arr[], int size)
    {
        ArrayList<Integer> test=new ArrayList<Integer>();
        int res=-1;
        for(int i=0;i<size;i++){
            if(arr[i]>=0)test.add(arr[i]);
        }
        //0,1,3
        int min=Collections.min(test);
        int max=Collections.max(test);
        int count=0;
        for(int i=min;i<max;i++){
            int check=i+1;
            for(int j=0;j<test.size();j++){
                if(check==test.get(j))count++;
            }
            if(count==0)res=check;
        }
        return res;
    }
        
	
	public static void main(String[] args) {
        Missing ms = new Missing();
        int test[] = {36,27,-35,43,-15,36,42,-1,-29,12,-23,40,9,13,-24,-10,-24,22,-14,-39,18,17,-21,32,-20,12,-27,17,-15,-21,-48,-28,8,19,17,43,6,-39,-8,-21,23,-29,-31,34,-13,48,-26,-35,20,-37,-24,41,30,6,23,12,20,46,31,-45,-25,34,-23,-14,-45,-4,-21,-37,7,-26,45,32,-5,-36,17,-16,14,-7,0,37,-42,26,28,38};
        System.out.println(ms.missingNumber(test, 84));
	}

}
