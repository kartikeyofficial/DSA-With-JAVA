import java.util.LinkedList;

public class LinkedListDemo {
    public static class Node{
        int data ;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    static void main(String[] args) {
        LinkedListDemo l1 = new LinkedListDemo();
        l1.head = new Node(1);

    }
}
