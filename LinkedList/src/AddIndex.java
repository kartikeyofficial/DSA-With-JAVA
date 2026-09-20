public class AddIndex {
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
            head = tail = nextNode;
            return;
        }
        tail.next = nextNode;
        tail = nextNode;
    }
    public void print(){
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
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node nextNode = new Node(data);
        size++;
        int i=0;
        Node temp = head;
        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        nextNode.next = temp.next;
        temp.next = nextNode;
    }

    static void main(String[] args) {
        AddIndex l1 = new AddIndex();
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
        System.out.println(size);
    }


}
