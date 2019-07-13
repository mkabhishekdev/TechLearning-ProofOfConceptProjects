package easy;

public class FlipImage {

	   public int[][] flipAndInvertImage(int[][] A) {
	        int[][] res={};
	        int[][] revRes=new int[A.length][A.length];  //always assign a value to array declared
	        int[][] flipRes={};
	        int x=0;
	        for(int i=0;i<A.length;i++){
	        	int y=0;
	            for(int j=A.length-1;j>=0;j--){
	                      //  System.out.println(A[i][j]);
	            
	            	revRes[x][y]=A[i][j];          //when there comes a situation where two arrays are involved, you can use something like x,y as used for incrementing
	            	y++;
	            }
	            x++;
	        }
	        
	        for(int i=0;i<revRes.length;i++){
	        	for(int j=0;j<revRes[i].length;j++){
	        		if(revRes[i][j]==0){
	        			revRes[i][j]=1;
	        		}
	        		else{
	        			revRes[i][j]=0;
	        		}
	        		System.out.println("Value after is: "+revRes[i][j]);
	        	}
	        }
	   //     System.out.println("revRes is-------"+revRes[2][0]);
	     /*   for(int i=0;i<revRes.length;i++){
	            for(int j=0; j<revRes[i].length;j++){
	                
	            }
	        } */
	        return revRes;
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[][] A= {{1,1,0},{1,0,1},{0,0,0}};
           FlipImage fi = new FlipImage();
           fi.flipAndInvertImage(A);
	}

}
