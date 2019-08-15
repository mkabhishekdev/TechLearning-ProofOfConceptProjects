package arrays;
import java.util.*;

/*
 Watch : https://www.youtube.com/watch?v=mj7N8pLCJ6w
 */

public class StockBuySell {

    public void stockBuySell(int price[], int n) {
         List<Integer> store = new ArrayList<Integer>();
         
         for(int i=0;i<n;i++) {
        	 for(int j=i+1;j<n;j++) {
        		 if(price[i]<price[j]) {
        			 int diff = price[j]-price[i];
        			 store.add(diff);
        			 
        		 }
        	 }
         }
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StockBuySell sb = new StockBuySell();
     
	}

}
