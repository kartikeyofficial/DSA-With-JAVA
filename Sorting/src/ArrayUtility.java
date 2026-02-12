import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int size = x.nextInt();
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The array Elements "+(i+1)+" is: ");
            nums[i] = x.nextInt();
        }

        return nums;
    }
    public static void printArray(int[] nums){
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
