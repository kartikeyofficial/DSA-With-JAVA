public class AddNodeStarting {
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


    public void addFirst(int data){

        // Step-1 : Create New Node
        Node newNode = new Node( data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        // Step-2 : NewNode next = head
        newNode.next = head; //link

        // Step-3 head = newNode
        head = newNode;

    }

    static void main(String[] args) {
        AddNodeStarting l1 = new AddNodeStarting();
        l1.addFirst(1);
        l1.addFirst(2);
    }

}
