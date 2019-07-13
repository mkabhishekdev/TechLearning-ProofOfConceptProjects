package linkedLists;

public class LinkedList {
    private int length=0; //length of the linked list
	
    //This class has a default constructor
    public LinkedList() {
	    length=0;
	}
  
    ListNode head; //This is the only field in the class. It holds the head of the linked list
    
    //Return the first node in the list
    /* Synchronized meaning: If one thread tries to read the data and other thread tries to update the same data, 
    it leads to inconsistent state. 
    This can be prevented by synchronizing access to the data. Use “synchronized” method */
    public synchronized ListNode getHead(){
    	return head;
    }
    
    //Insert a node at the beginning of a list
    public synchronized void insertAtBegin(ListNode node){
    	node.setNext(head); //set the pointer of new node to head
    	head=node; //node becomes the new head since it is the first node now           
    	length++; //length gets incremented with each addition of a new node
    }
    
    //Insert a node at the end of a list
    public synchronized void insertAtEnd(ListNode node){
        if(head==null)head=node;
        else{
        	ListNode p,q;
        	for(p=head;(q=p.getNext())!=null;p=q){
        		p.setNext(node);  //last nodes next pointer points to the new node
        	}
        }
        length++;
    }
    
    //Add a new value to the list at a given position
    public void insert(int data, int position){
    	
    }
}
