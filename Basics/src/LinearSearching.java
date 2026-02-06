import java.util.Scanner;

public class LinearSearching {
    public static int LinearSearch(int[] newArr,int key){
        for (int i=0;i<newArr.length;i++){
            if (newArr[i]==key){
                return i;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Linear Search-\n");
        System.out.print("Enter The Size Of The Array:");
        int size = x.nextInt();
        int[] newArr = new int[size];
        for (int i=0; i<newArr.length;i++){
            System.out.print("Enter Array Elements "+(i+1)+" is: ");
            newArr[i]= x.nextInt();
        }
        System.out.print("Enter The Number Do You Want to be Search:");
        int key = x.nextInt();
        int index = LinearSearch(newArr,key);
        if (index==-1){
            System.out.print("Not Found!");
        }else
        {
            System.out.println("Element is Present at index: "+index);
        }

    }
}
