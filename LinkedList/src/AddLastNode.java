public class AddLastNode {
    public class Node{
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node nextNode = new Node(data);
        if (head==null){
            head = tail = nextNode;
            return;
        }

        tail.next = nextNode;
        tail = nextNode;
    }

    static void main(String[] args) {
        AddLastNode l1 = new AddLastNode();
        l1.addLast(3);
        l1.addLast(4);
    }
}
