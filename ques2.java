
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
}

public class Main {

    // Palindrome method
    static boolean isPalindrome(String str) {

        Stack st = new Stack();

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = (char) st.pop();

            if (ch != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        String str = "MADAM";

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
