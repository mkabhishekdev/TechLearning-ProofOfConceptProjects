package wrestling_abstractInterface;

public abstract class WrestlerAbstract {
  
	public void paymentForWork(int hours){
		System.out.println("The wrestler will make $" + hours*250.00 + "for tonight's match");
	}
	
	public abstract void themeMusic(); //unique methods specific to the subclass
	
	public abstract void finisher();
	
}
