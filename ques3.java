
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

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class Main {

    // Challenge 3: Reverse Stack
    static void reverseStack(Stack s1) {

        Stack s2 = new Stack();

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Original Stack:");
        st.display();

        reverseStack(st);

        System.out.println("After Reversing:");
        st.display();
    }
}
