public class StackLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public static class Stack {

            static Node head = null;

            public  boolean isEmpty() {
                return head == null;
            }

            // push
            public  void push(int data) {
                Node newNode = new Node(data);
                if (isEmpty()) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

            public  int pop() {
                if (isEmpty()) {
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

            // peak
            public  int peak() {
                if (isEmpty()) {
                    return -1;
                }
                return head.data;
            }
        }

        static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);

            while (!s.isEmpty()){
                System.out.println(s.peak());
                s.pop();
            }
        }
 }

