import java.util.Scanner;

public class Arrays {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] newArr = new int[10];
        for (int i=0; i<newArr.length;i++){
            System.out.print("Enter Array Elements "+(i+1)+" is: ");
            newArr[i]= x.nextInt();
        }
        System.out.println("Your Array is: ");
        for (int i=0;i<newArr.length;i++){
            System.out.print(i+" ");
        }
    }
}
