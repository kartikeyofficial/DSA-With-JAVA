import java.util.ArrayList;

public class SumofSortedList {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        pairSum(list,target);

    }
    public static void pairSum(ArrayList<Integer> list, int target){
        int counter=0;
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j< list.size();j++){
                if (list.get(i)+list.get(j)==target){
                    System.out.println("Possible index is: ("+i+","+j+")");
                    counter++;
                }

            }
        }
        System.out.println("Total Possible sum is: "+counter);
    }

}
