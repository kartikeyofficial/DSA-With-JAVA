import java.util.ArrayList;
import java.util.Collections;
class SortingList {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(7);

        Collections.sort(list);
        System.out.println("Ascending Order: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending Order: "+list);

    }



}
