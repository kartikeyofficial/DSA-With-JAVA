import java.util.ArrayList;

public class StackArrayList {
    static ArrayList<Integer> list = new ArrayList<>();
    public  boolean isEmpty() {
       return list.size() == 0;
    }
    // push
    public  void push(int data){
        list.add(data);
    }
    // pop
    public  int pop(){
        if (isEmpty()){
            return  -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //peak
    public  int peak(){
        if (isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }


    static void main(String[] args) {
        StackArrayList s = new StackArrayList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()){
            System.out.println(s.peak());
            s.pop();
        }
    }
}
