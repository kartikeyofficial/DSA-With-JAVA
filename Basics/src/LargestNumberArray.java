import java.util.*;

public class LargestNumberArray {
    public static int LasrgestNumber(int[] newArr){
        int min = Integer.MIN_VALUE;
        int max_Value=0;
        for (int i=0;i<newArr.length;i++){
            if(min<newArr[i]){
                max_Value = newArr[i];
            }
        }
        return max_Value;
    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Largest Number in Array-\n");
        System.out.print("Enter The Size Of The Array:");
        int size = x.nextInt();
        int[] newArr = new int[size];
        for (int i = 0; i < newArr.length; i++) {
            System.out.print("Enter Array Elements " + (i + 1) + " is: ");
            newArr[i] = x.nextInt();
        }
        System.out.println("Largest Element in Array is: "+LasrgestNumber(newArr));
    }
}
