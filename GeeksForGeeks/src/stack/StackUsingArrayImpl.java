package stack;


public class StackUsingArrayImpl {
    int arr[];
    int size;
    int index=0;
    
    public StackUsingArrayImpl(int size) {
        this.size = size;
        arr = new int[size];
    } 
    
	public void push(int data) {
	   arr[index]=data;
	   index++;
	}
	
	public int pop() {
	        return arr[--index];
	}
	
	public boolean isEmpty() {
		if(arr.length==0)return true;
		return false;
	}
	
	public int size() {
		size = arr.length;
		return size;
	}
	
	public boolean isFull() {
		if(index==size-1)return true;
		else return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            StackUsingArrayImpl stack = new StackUsingArrayImpl(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.pop();
            System.out.println("1. Size of stack after push operations: " + stack.size());

            System.out.printf("2. Pop elements from stack : ");
            while (!stack.isEmpty()) {
                System.out.printf(" %d", stack.pop());
            }

            System.out.println("\n3. Size of stack after pop operations : " + stack.size());
	}

}
