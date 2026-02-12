public class SelectionSorting {
    public static void  selection(int[] newArray){
        for (int i=0;i<newArray.length;i++){
            int minPos = i;
            for (int j=i+1;j<newArray.length;j++){
                if(newArray[minPos]> newArray[j]){
                    minPos = j;
                }
            }
            int temp = newArray[minPos];
             newArray[minPos] = newArray[i];
             newArray[i] = temp;
        }
    }
    static void main(String[] args) {
        System.out.println("Welcome to Selection Sort\n");
        int[] newArray = ArrayUtility.inputArray();
        selection(newArray);
        ArrayUtility.printArray(newArray);

    }
}
