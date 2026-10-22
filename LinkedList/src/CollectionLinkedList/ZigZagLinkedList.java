package CollectionLinkedList;

public class ZigZagLinkedList {
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
    public void zigZag(){
        // Find Mid
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse the 2nd Half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next ;

         while (curr != null){
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
         Node left = head;
         Node right = prev;
         Node nextLeft;
         Node nextRight;

         while (left != null && right != null){
             nextLeft = left.next;
             left.next = right;
             nextRight = right.next;
             right.next = nextLeft;

             left = nextLeft;
             right = nextRight;
         }
    }
    public void printLink(){
        if (head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void main(String[] args) {
        ZigZagLinkedList z1 = new ZigZagLinkedList();
        z1.addFirst(5);
        z1.addFirst(4);
        z1.addFirst(3);
        z1.addFirst(2);
        z1.addFirst(1);

        z1.printLink();
        z1.zigZag();
        z1.printLink();

    }
}
