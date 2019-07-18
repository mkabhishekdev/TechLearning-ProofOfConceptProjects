package challenges;



//https://stackoverflow.com/questions/43310129/deleting-nodes-greater-than-specified-value-from-linked-list
public class FastCaseDeleteNodeX {
    Node head;
    
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
    
	//At the front of the linked list
	public void push(int new_data){
		Node new_node = new Node(new_data); //create the new node
		new_node.next = head; //point the new node next to head
		head = new_node; //change the head to new node
	}
	
	public Node greaterThanSpecific(Node start,int x){
		Node curr=start;
		Node prev=null;
		
		if(start==null)return start;
		if(start.data > x && start.next == null) return null;
		while(curr.next!=null && curr.data > x){
		   prev=curr;
		   curr=curr.next;
		}
		if(prev!=null)prev.next=null;
		
		Node newHead = curr;
		while(curr.next!=null){
			if(curr.next.data >= x){
				curr.next = curr.next.next;
			}
			else{
				curr = curr.next;
			}
		}
		return newHead;
	}
	
	//print a linked list
	public void printList(){
		Node printMe  = head;
		while(printMe!=null){
			System.out.println(printMe.data+" ");
			printMe = printMe.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FastCaseDeleteNodeX res = new FastCaseDeleteNodeX();
        res.push(17);
        res.push(55);
        res.push(26);
        res.push(19);
        res.push(11);
        res.push(34);
        res.push(10);
        System.out.println(res.greaterThanSpecific(res.head, 19));
        res.printList();
	}
   
}


/*	private static Node removeNodes(Node start, int x) {

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
}  */