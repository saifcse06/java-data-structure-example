package LinkedListExample;
/*
Java Program on Linked List
 */
public class LinkedListExample {
    // Creating a node
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        LinkedListExample linkedList = new LinkedListExample();

        // Assign value values
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connect nodess
        linkedList.head.next = second;
        second.next = third;

        // printing node-value
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}
