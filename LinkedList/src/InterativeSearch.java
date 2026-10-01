public class InterativeSearch {
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
        if (head==null){
            head=tail=nextNode;
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
    public void print(){
        if (head==null){
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
    public int deleteLast(){
        if (size==0){
            System.out.println("Linked List is Empty!");
            return Integer.MIN_VALUE;
        }else if (size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return  val;
        }
        Node prev = head;
        for (int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
        Node temp = head;
        int i=0;
        while (temp!=null){
            if (temp.data==key){
                return i;

            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    static void main(String[] args) {
        InterativeSearch d1 = new InterativeSearch();
        d1.print();
        d1.addFirst(2);
        d1.print();
        d1.addFirst(1);
        d1.print();
        d1.addLast(3);
        d1.print();
        d1.add(1,10);
        d1.print();
        d1.deleteLast();
        d1.print();
        System.out.println("Linked list Value is found at Index: "+ d1.iterativeSearch(10));
        System.out.println(d1.iterativeSearch(6));
    }
}
