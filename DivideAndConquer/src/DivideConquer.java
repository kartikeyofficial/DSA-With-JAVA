public class DivideConquer {
    static void main(String[] args) {
       int[] arr = {4,5,6,7,0,1,2};
       int target = 0;
       int tarIdx = search(arr,target,0,arr.length);
        System.out.println(tarIdx);
    }
    public static int search(int[] arr,int tar,int si, int ei){
        if (si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;

        if(arr[mid]==tar){
            return mid;
        } // mid Line 1
        if (arr[si]<=arr[mid]){
            // case a: left

            if(arr[si]<=tar && tar<arr[mid]){
                return search(arr,tar,si,mid-1);
            }else {
                // case b: right
              return   search(arr,tar,mid+1,ei);
            }
        } // mid Line 2
        else {
             if (arr[mid]<=tar && tar<=arr[ei]){
                 return search(arr,tar,mid+1,ei);
             }else {
                 return search(arr,tar,si,mid-1);
             }
        }
    }
}

