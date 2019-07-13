package microsoft;
import java.util.*;

public class GetStudents {

	HashMap<Integer,String> getStudents(HashMap<Integer,Integer> studentMarks){
		HashMap<Integer,String> studentMedal = new HashMap<Integer,String>();
		
		Set<Integer> k = studentMarks.keySet();  //to get the 'keys' use Set<Integer>, keySet()
		Iterator<Integer> it = k.iterator();    //iterator over the keys , Iterator<Integer>,iterator()
		while(it.hasNext()){
			 Integer key = it.next();
			 Integer val = studentMarks.get(key);
			 if(val>=90){
				 studentMedal.put(key,"GOLD");
			 }
			 else if(val>=80 && val<90){
				 studentMedal.put(key,"SILVER");
			 }
			 else{
				 studentMedal.put(key,"BRONZE");
			 }
		}
		
		return studentMedal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetStudents gs = new GetStudents();
		HashMap<Integer,Integer> test = new HashMap<Integer,Integer>();
		
		test.put(1, 95);
		test.put(2, 65);
		test.put(3, 75);
		System.out.println(gs.getStudents(test));

	}

}
