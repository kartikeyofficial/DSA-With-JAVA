import java.util.Scanner;

public class ReverseAnArray {
    public static void reverse(int[] newArray){
        int first = 0;
        int last = newArray.length-1;

        while (first<last){
            int temp = newArray[last];
            newArray[last]= newArray[first];
            newArray[first]=temp;
            first++;
            last--;
        }
    }
    static void main(String[] args) {
        System.out.println("Welcome to Reverse An Array\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array:");
        int size = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Elements "+(i+1)+" :");
            newArray[i]= x.nextInt();
        }
        reverse(newArray);
        System.out.println("Reverse Array is:");
        for (int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
        System.out.println();
    }
}
