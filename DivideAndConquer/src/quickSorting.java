public class quickSorting {
    static void main(String[] args) {
        int[] arr = {6,3,2,7,5,9,1};
        QuickSort(arr,0,arr.length-1);
        printArr(arr);

    }

    public static void printArr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void QuickSort(int[] arr,int si, int ei){
        if (si>=ei){
            return;
        }
        int pindx =partition(arr,si,ei);
        QuickSort(arr,si,pindx-1);  // left part
        QuickSort(arr,pindx+1,ei);  // Right Part
    }
    public static int partition(int[] arr, int si, int ei){
       int pivot = arr[ei];
       int i = si-1;
       for (int j=si;j<ei;j++){
           if (arr[j]<=pivot){
               i++;
               // Swap
               int temp = arr[j];
               arr[j]= arr[i];
               arr[i] = temp;
           }
       }
        i++;
        // Swap
        int temp = pivot;
        arr[ei] = arr[i];  // pivot = arr[i] don't be written.
        arr[i] = temp;
        return i;

    }
}
