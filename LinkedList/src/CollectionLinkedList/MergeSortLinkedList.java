package CollectionLinkedList;

public class MergeSortLinkedList {
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
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
        }
        return  slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null){
            if (head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return  mergeLL.next;
    }
    public Node mergeSort(Node head){
        if (head == null || head.next == null){
            return  head;
        }
        // find Mid
        Node mid = getMid(head);

        // Left & Right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft,newRight);
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
        MergeSortLinkedList l1 = new MergeSortLinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);
        l1.addFirst(6);
        l1.head = l1.mergeSort(l1.head);
        l1.printLink();


    }
}
