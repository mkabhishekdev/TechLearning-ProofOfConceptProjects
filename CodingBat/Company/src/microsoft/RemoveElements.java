package microsoft;
import java.util.*;

/* Create a method which can remove a List from another List */
public class RemoveElements {

	List<String> removeElements(ArrayList<String> ls1, ArrayList<String> ls2){
		ls1.removeAll(ls2);
		return ls1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RemoveElements re = new RemoveElements();
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("abhi");
        test1.add("test");
        ArrayList<String> test2 = new ArrayList<String>();
        test2.add("test");
        System.out.println(re.removeElements(test1, test2));
	}

}
