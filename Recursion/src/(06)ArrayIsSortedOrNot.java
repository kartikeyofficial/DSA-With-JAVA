import java.util.Scanner;

class ArrayIsSortedOrNot {
    static void main(String[] args) {
        System.out.println("Enter The Size Of The Array: ");
        Scanner x = new Scanner(System.in);
        int size  = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Element "+(i+1)+" is: ");
            newArray[i] = x.nextInt();
        }
        System.out.println("Array is Sorted: "+isSorted(newArray,0));
    }
    public static boolean isSorted(int[] newArray,int i){
        if (i == newArray.length-1){
            return true;
        }
        if (newArray[i]> newArray[i+1]){
            return false;
        }
        return isSorted(newArray,i+1);

    }
}
