public class DeleteFromNthNode {
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
    public void deleteNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }
        if (n == size){
            head = head.next; // remove first
            return;
        }
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
    public boolean isPalindrome(){
        // Check Base Case if in linked List have Null Or Only one node.
        if (head == null || head.next== null){
            return true;
        }

        // Find mid-Node
        Node mid = findMid(head);

        // Reverse the Mid after Nodes  Right Half

        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;  // right Half Head
        Node left = head;

        while (right != null){
            if (left.data != right.data){
                return  false;
            }
            left = left.next;
            right = right.next;
        }
        return  true;
    }

    static void main(String[] args) {
        DeleteFromNthNode d1 = new DeleteFromNthNode();
        d1.addFirst(2);
        d1.addLast(2);
        d1.addLast(1);
        d1.addFirst(4);
        d1.print();
        System.out.println(d1.isPalindrome());




    }
}
