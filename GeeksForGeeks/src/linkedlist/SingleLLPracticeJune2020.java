package linkedlist;

/*class Node
{
 int data;
 Node next;
 Node(int x)
 {
	 data = x;
     next = null;	 
 }
}*/

public class SingleLLPracticeJune2020 {

	Node head;
	
	public void Push(int data){
	  Node new_node = new Node(data);
	  if(head == null){
		  head = new_node;
		  return;
	  }
	  Node curr = head;
	  while(curr.next != null){
		  curr = curr.next;
	  }
	  curr.next = new_node;
	  new_node.next = null;
	}
	
	public void PrintLL()
	{
		Node curr = head;
		while(curr != null){
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	 
	public int IndexSearchItem(int searchItem)
	{
		Node curr=head;
		int i=0;
		while(curr!=null){
			if(curr.data == searchItem){
				System.out.println("Item returned on search is: "+i);
		      	return i;	
			}
			curr=curr.next;
			i++;
		}
		System.out.println("Search item not found in the record present");
		return -1;
	}
	
	//code from here
	public void ReverseLL()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SingleLLPracticeJune2020 sll = new SingleLLPracticeJune2020();
       sll.Push(2);
       sll.Push(3);
       sll.Push(4);
       sll.Push(5);
       sll.PrintLL();
      // sll.IndexSearchItem(8);
	}

}
