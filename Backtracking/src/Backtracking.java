public class Backtracking {
    static void main(String[] args) {
        System.out.println("welcome to Backtracking\n");
        int[] newArr = new int[5];
        changeArr(newArr,0,1);
        printArr(newArr);

    }
    public static void printArr(int[] newArr){
        for (int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }
    public static void changeArr(int[] newArr, int i,int val){
        if (i== newArr.length){
            printArr(newArr);
            return;
        }

        newArr[i] = val;
        changeArr(newArr,i+1,val+1);
        newArr[i] = newArr[i]-2;
    }
}
