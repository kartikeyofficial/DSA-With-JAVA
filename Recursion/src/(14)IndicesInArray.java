class IndicesInArray {
    public static int[] occurences(int[] arr , int target,int i,int count){

        if (i == arr.length) {
            return new int[count];
        }
        if (arr[i] == target) {
            int[] result = occurences(arr, target, i + 1, count + 1);
            result[count] = i;
            return result;
        } else {
            return occurences(arr, target, i + 1, count);
        }
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,5,2};
        int target = 2;
        int[] occ = (occurences(arr,target,0,0));
        for (int i : occ) {
            System.out.print(i+" ");
        }
    }
}
