public class DemoPractice {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node nextNode = new Node(data);
        if (head == null){
            head = tail = nextNode;
            return;
        }
        nextNode.next = head;
        head = nextNode;
    }
    public void addLast(int data){
        Node nextNode = new Node(data);
        if (head == null){
            head = tail = nextNode;
            return;
        }
        tail.next = nextNode;
        tail = nextNode;
    }
    public void print(){
        if (head == null){
            System.out.println("Empty Linked List");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("Null");

    }

    static void main(String[] args) {
        DemoPractice l1 = new DemoPractice();
        l1.print();
        l1.addFirst(1);
        l1.print();
        l1.addLast(2);
        l1.print();
        l1.addFirst(3);
        l1.print();
        l1.addLast(4);
        l1.print();
    }

}
