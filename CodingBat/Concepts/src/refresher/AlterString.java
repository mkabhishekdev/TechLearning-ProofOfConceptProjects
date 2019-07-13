package refresher;

public class AlterString {

	String alterString(String check){
		String indv="",me="";
		me=indv;
		for(int i=0;i<check.length();i++){
		   indv=check.substring(i,i+1);
		   if((!indv.equals("A"))&&(!indv.equals("E"))&&(!indv.equals("I"))&&(!indv.equals("O"))&&(!indv.equals("U"))){
			   char c = indv.charAt(0);
			   c+=1;
			   System.out.println(c);
			//   System.out.println(indv.charAt(0));
		      
			   me.replace(indv.charAt(0),c);
			  // check.replace(c, change);
		   }
		}
		System.out.println(me);
		return me;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AlterString test = new AlterString();
         System.out.println(test.alterString("JAVA"));
	}

}
