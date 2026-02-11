import java.util.Scanner;

public class BubbleSort {
    public static void buubleSort(int[] newArray){
        int swaps =0;
        for (int turn=0;turn<newArray.length-1;turn++){
            for (int i=0;i<newArray.length-1-turn;i++){
                if(newArray[i]>newArray[i+1]){
                    int temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("total Swaps Are "+swaps);
    }
    public static void printArray(int[] newArray){
        for (int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
    static void main(String[] args) {
        System.out.println("Welcome to the Bubble Sort\n");
        System.out.print("Enter The Size of The Array: ");
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Elements "+(i+1)+" is: ");
            newArray[i] = x.nextInt();

        }
        buubleSort(newArray);
        printArray(newArray);
    }
}
