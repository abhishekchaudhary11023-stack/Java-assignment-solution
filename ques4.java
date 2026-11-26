
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    int pop() {
        if (top == null) {
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    // Check whether Stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Display Stack
    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Find middle element
    int middle() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        Node slow = top;
        Node fast = top;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}

public class Main {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack Elements:");
        st.display();

        System.out.println("Middle Element: " + st.middle());
    }
}
