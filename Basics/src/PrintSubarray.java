import java.util.Scanner;

public class PrintSubarray {
    public static void subArray(int[] newArray){
        for (int i=0;i<newArray.length;i++){
            int start = i;
            for (int j=i;j<newArray.length;j++){
                int end = j;
                for (int k=start;k<=end;k++){
                    System.out.print(newArray[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        System.out.println("Welcome to Find SubArrays in Array");
        Scanner x= new Scanner(System.in);
        System.out.print("Enter The Size Of an Array:");
        int size  = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<newArray.length;i++){
            System.out.print("Enter The Elements Of the Array "+(i+1)+" : ");
            newArray[i] = x.nextInt();
        }
        subArray(newArray);

    }
}
