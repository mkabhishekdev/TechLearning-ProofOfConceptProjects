package microsoft;

public class Fibonacci {

	public int fibonacci(int n){
		int sum=0;
		
		if(n==1)return 0;
		if(n==2)return 1;
		if(n>2){
			for(int i=n;i>2;i--)
			{
			sum = fibonacci(n-1) + fibonacci(n-2);
			}
		}
		sum = sum+1;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Fibonacci fb = new Fibonacci();
          System.out.println(fb.fibonacci(6));
	}

}
