package refresher;

public class CheckPower {

	boolean Check(int n){
		return (n!=0) && ((n&(n-1))==0);
	}
	
	public static void main(String[] args) {
		CheckPower cp = new CheckPower();
		System.out.println(cp.Check(8));
	}
}
