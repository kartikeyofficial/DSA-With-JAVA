public class KedanesAlgorithm {
    public static void kedane(int[] newArray){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i=0;i<newArray.length;i++){
            currentSum = currentSum + newArray[i];
            if (currentSum<0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("Our Maximum Subarray sum is: "+maxSum);

    }

    static void main(String[] args) {
        System.out.println("Welcome To Kedanes Algorithm\n");
        int[] newArray={-1,-2,-3,-4,5,1,-6};
        kedane(newArray);
    }
}
