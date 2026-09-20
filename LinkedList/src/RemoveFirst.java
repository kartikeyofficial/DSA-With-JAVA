public class RemoveFirst {
    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node nextNode = new Node(data);
        size++;
        if (head == null){
            head = tail = nextNode;
            return;
        }
        nextNode.next = head;
        head = nextNode;
    }
    public void addLast(int data){
        Node nextNode = new Node(data);
        size++;
        if (head == null){
            head=tail=nextNode;
            return;
        }
        tail.next = nextNode;
        tail = nextNode;
    }
    public void add(int idx, int data){
        if (idx==0){
            addFirst(data);
            return;
        }
        size++;
        Node nextNode = new Node(data);
        int i=0;
        Node temp = head;

        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        nextNode.next = temp.next;
        temp.next = nextNode;
    }
    public int removeFirst(){
        if (size==0){
            System.out.println("Empty LinkedList!");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public void print(){
        if (head== null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void main(String[] args) {
        RemoveFirst l1 = new RemoveFirst();
        l1.print();
        l1.addFirst(1);
        l1.print();
        l1.addFirst(2);
        l1.print();
        l1.addLast(3);
        l1.print();
        l1.addFirst(4);
        l1.print();
        l1.add(0,10);
        l1.print();
        l1.add(2,20);
        l1.print();
        l1.removeFirst();
        l1.print();
    }

}
