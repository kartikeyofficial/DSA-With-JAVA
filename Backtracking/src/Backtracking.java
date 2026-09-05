public class Backtracking {
    static void main(String[] args) {
        int[] numArr = new int[5];
        changeArr(numArr,0,1);
        printArr(numArr);
    }
    public static void printArr(int[] numArr){
        for (int i=0;i<numArr.length;i++){
            System.out.print(numArr[i]+" ");
        }
        System.out.println();
    }
    public static void changeArr(int[] numArr, int i, int val){
        if (i== numArr.length){
            printArr(numArr);
            return;
        }

        numArr[i] = val;
        changeArr(numArr,i+1,val+1);
        numArr[i]= numArr[i]-2;
    }
}
