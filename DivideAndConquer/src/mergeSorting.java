public class mergeSorting {
   public static void printArray(int[] arr){
       System.out.println("Sorted Array is:\n");
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
   }
   public static void mergeSort(int[] arr, int si,int ei){
       if(si>=ei){
           return;    // Base Case
       }
       int mid = si+(ei-si)/2;
       mergeSort(arr,si,mid);    // Left Part
       mergeSort(arr,mid+1,ei);  // Right Part
       merge( arr,si,mid,ei);

   }
   public static void merge(int[] arr,int si,int mid, int ei){
       int[] temp = new int[ei-si+1];
       int i = si; // Iterator for left part
       int j = mid+1; // Iterator for right part
       int k = 0;   //Iterator for temp arr;
       while(i<=mid && j<=ei){
           if(arr[i]<arr[j]){
               temp[k] = arr[i];
               i++;
           }
           else{
               temp[k]= arr[j];
               j++;
           }
           k++;
       }
       // Left Part
       while(i<=mid){
           temp[k++]=arr[i++];
       }
       // right Part
       while (j<=ei){
           temp[k++]=arr[j++];
       }

       // Copy temp to Original arr
       for(k=0,i=si;k<temp.length;k++,i++){
           arr[i]= temp[k];

       }

   }
   static void main(String[] args) {
        int[] arr = {6,3,9,4,7,2};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}

