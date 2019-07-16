package challenges;

//https://stackoverflow.com/questions/43310129/deleting-nodes-greater-than-specified-value-from-linked-list
public class FastCaseDeleteNodeX {

	private static Node removeNodes(Node start, int x) {

		if(start == null) return start;

		if(start.data > x && start.next == null) return null;

		//find first head node
		Node cur = start;
		Node prev = null;

		//4,5,3,2,1,6 --- where x = 2
		while(cur != null && cur.data > x) {
		    prev = cur;
		    cur = cur.next;
		}

		if(prev != null) prev.next = null;

		Node newHead = cur;

		while(cur.next != null) {
		    if(cur.next.data > x) {
		        cur.next = cur.next.next;
		    } else {
		        cur = cur.next;
		    }
		}

		return newHead;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
