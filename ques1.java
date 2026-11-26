
// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class
class Stack {
    Node top;
    int count;

    // Constructor
    Stack() {
        top = null;
        count = 0;
    }

    // Insert element into Stack
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        count++;
        System.out.println(data + " inserted");
    }

    // Remove top element
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int removed = top.data;
        top = top.next;

        count--;
        System.out.println(removed + " removed");

        return removed;
    }

    // Return top element
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // Check whether Stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Return total number of elements
    int size() {
        return count;
    }

    // Display Stack elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.print("Stack: ");
        st.display();

        System.out.println("Top element: " + st.peek());

        st.pop();

        System.out.print("Stack after pop: ");
        st.display();

        System.out.println("Size: " + st.size());

        System.out.println("Is Empty: " + st.isEmpty());

        st.pop();
        st.pop();

        System.out.println("Is Empty: " + st.isEmpty());

        st.pop();
    }
}
