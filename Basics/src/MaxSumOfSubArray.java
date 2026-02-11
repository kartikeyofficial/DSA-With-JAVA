import java.util.Scanner;

public class MaxSumOfSubArray {
    public static void subArraySum(int[] newArray){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<newArray.length;i++){
            int start = i;
            for (int j=i;j<newArray.length;j++){
                int end = j;
                currSum = 0;
                for (int k=start;k<=end;k++){
                    currSum += newArray[k];
                }
                System.out.println(currSum);
                if (maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum is: "+maxSum);  
    }
    static void main(String[] args) {
        System.out.println("Welcome to Find SubArrays Maximum Sum in Array");
        Scanner x= new Scanner(System.in);
        System.out.print("Enter The Size Of an Array:");
        int size  = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<newArray.length;i++){
            System.out.print("Enter The Elements Of the Array "+(i+1)+" : ");
            newArray[i] = x.nextInt();
        }
        subArraySum(newArray);

    }
}
