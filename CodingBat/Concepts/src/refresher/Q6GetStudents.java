package refresher;
import java.util.*;

public class Q6GetStudents {

	HashMap<Integer,String> getStudents(HashMap<Integer,Integer> input){
		HashMap<Integer,String> res=new HashMap<Integer,String>();
		
		Set<Integer> s = input.keySet();
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()){
			Integer reg = it.next();
			Integer marks = input.get(reg);
			if(marks>=90)res.put(reg,"Gold");
			else if((marks>=80) && (marks<90))res.put(marks,"Silver");
			else if((marks>=70) && (marks<80))res.put(marks, "Bronze");
			else res.put(marks,"No Medal");
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Q6GetStudents qs = new Q6GetStudents();
        HashMap<Integer,Integer> test = new HashMap<Integer,Integer>();
        test.put(1,95);
        test.put(2,85);
        test.put(3,44);
        System.out.println(qs.getStudents(test));
	}

}
