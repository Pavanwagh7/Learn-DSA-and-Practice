public class Stack {
    private int capacity;
    private int[] stack;
    
    private int top;
    

    //contructor
    public Stack (int cap) {
        this.capacity = cap;
        stack = new int[cap];
        this.top = -1; 
    }



    int size () {
        return top + 1;
    }
    public boolean isFull () {
        if (top == capacity - 1) return true;
        return false;
    }

    public boolean isEmpty () {
        if (top == -1) return true;
        return false;
    }

    public void push (int ele) {
        if (isFull()) {
            System.out.println("Stack is full.");
        }
        else {
            stack[top + 1] = ele;
            top++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top--];
    }
    public int peek () {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else 
            return stack[top];
    }
}
