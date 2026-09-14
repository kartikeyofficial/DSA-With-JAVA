import java.util.ArrayList;

 class Arrayist {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<String> list1 = new ArrayList();
        ArrayList<Boolean> list2 = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(4,200);
        System.out.println(list);
//        System.out.println(list.get(2));

        list.remove(0);
        System.out.println(list);
        list.set(2,100);
        System.out.println(list);

        System.out.println( list.contains(10));
        System.out.println(list.contains(100));

        System.out.println(list);

        System.out.println(list.size());    // for size

        for (Integer li: list){
            System.out.print(li+",");
        }
      
    }
}
