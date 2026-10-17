package CollectionLinkedList;

import java.util.LinkedList;

public class LinkedListCollection {
    static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);

        for (Integer link : l1){
            System.out.print(link+"-->");
        }
        System.out.print("null");
        System.out.println();



    }
}
