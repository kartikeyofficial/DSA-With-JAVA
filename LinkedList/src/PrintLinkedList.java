public class PrintLinkedList {
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
        PrintLinkedList l1 = new PrintLinkedList();
        l1.printLink();
        l1.addFirst(1);
        l1.printLink();
        l1.addFirst(2);
        l1.printLink();
        l1.addLast(3);
        l1.printLink();
        l1.addLast(4);
        l1.printLink();
        l1.addFirst(10);
        l1.printLink();
        l1.addLast(100);
        l1.printLink();

    }
}
