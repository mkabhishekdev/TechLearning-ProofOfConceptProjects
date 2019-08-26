package challenges;
import java.util.*;
import java.util.concurrent.BlockingQueue;

public class OrgChart {
/*
 NOTE: In the output shared for the employees to be displayed, condition given employees are always displayed in the order processed. So I am using a Queue,
 but there is a mistake in the output shown in the question
 if the input is: sharilyn->denice->lawana->lissette->lan
 output is showed there: sharilyn->denice->lissette->lawana->lan (lawana has to be before lissette since she was in queue before)
 I resolved this in my solution
 */
	 Map<String,String> employeeStorage = new HashMap<String,String>();
	 Queue<String> employeeOrderQueue = new LinkedList<String>(); //to maintain the employee order
	 Queue<String> employeeCount = new LinkedList<String>();
	 Map<String,String> employeeManagerRelation = new HashMap<String,String>();

	 public void add(String id, String name, String managerId)
	    {
         if((managerId!="-1")&&(!employeeStorage.containsKey(id))&&(!employeeManagerRelation.containsKey(id))){
	        employeeStorage.put(id,name);
	        employeeManagerRelation.put(managerId,name);
		    }
         if((managerId=="-1")&&(!employeeStorage.containsKey(id))){
		    	employeeStorage.put(id,name);
		    }
	        employeeOrderQueue.add(id);      
	    }

	    public void print()
	    {
	    	while(!employeeOrderQueue.isEmpty()){
	    	for (Map.Entry<String, String> entry : employeeStorage.entrySet()) {
	    		String queueFront = employeeOrderQueue.peek();
	    		if(queueFront.equals(entry.getKey())){
	    	    System.out.println(entry.getValue()+" ["+entry.getKey()+"]");
	    		}
	    	}
	        employeeOrderQueue.poll(); 
	    	}
	    }

	    public void remove(String employeeId)
	    {
	        Iterator it = employeeOrderQueue.iterator();
	        int count = 0;
	        while (it.hasNext()) {
	            Object e = it.next();
	            if (e.equals(employeeId)) {
	                it.remove();
	            //    return e;
	            }
	            count++;
	        }
	      //  return null;}
	    }

	    public void move(String employeeId, String newManagerId)
	    {
	        throw new UnsupportedOperationException();
	    }

	    public int count(String employeeId)
	    {
	        employeeCount.add(employeeId); 
	        return employeeCount.size();
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         OrgChart oc = new OrgChart();
         oc.add("10","Sharilyn Gruber","-1");
         oc.add("7","Denice Mattice","10");
         oc.add("3","Lawana Futrell","-1");
         oc.add("34","Lissette Gorney","7");
         oc.add("5","Lan Puls","3");
        oc.remove("3");
         oc.print();
     //    System.out.println(oc.count("10"));
	}

}
