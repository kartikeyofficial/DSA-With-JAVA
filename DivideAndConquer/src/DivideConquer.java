public class DivideConquer {
    static void main(String[] args) {
       int[] arr = {4,5,6,7,0,1,2};
       int target = 0;
       int tarIdx = search(arr,target,0,arr.length);
    }
    public static int search(int[] arr,int tar,int si, int ei){
        int mid = si+(ei-si)/2;

        if(arr[mid]==tar){
            return mid;
        }
        if (arr[si]<=arr[mid]){
            // case a: left

            if(arr[si]<=tar && tar<arr[mid]){
                return search(arr,tar,si,mid);
            }
        }
        else {

        }
    }
}

