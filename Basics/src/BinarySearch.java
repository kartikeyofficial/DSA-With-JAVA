import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearch(int[] newArray, int key){
        int start =0;
        int end = newArray.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (newArray[mid]==key){
                return mid;
            }
            if (newArray[mid]<key) {
                start = mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        System.out.println("Welcome to Binary Searching\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array:");
        int size = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Elements "+(i+1)+" :");
            newArray[i]= x.nextInt();
        }
        System.out.println("Enter The Element do You want to be Search:");
        int key = x.nextInt();
        int index = BinarySearch(newArray,key);
        if (index==-1){
            System.out.println("Not Found!");
        }else
        {
            System.out.println("Element is Found At index: "+index);
        }

    }
}
