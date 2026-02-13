 class DiagonalSum {
    public static int diagonal(int[][] newArray){
        int sum =0;
//        for (int i=0;i<newArray.length;i++){
//            for (int j=0;j<newArray[0].length;j++){
//                if(i==j){
//                    sum += newArray[i][j];
//                } else if (i+j == newArray.length-1) {
//                    sum += newArray[i][j];
//                }
//            }
//        }
        for (int i=0;i<newArray.length;i++){
            sum +=newArray[i][i];
            if(i != newArray.length-1-i){
                sum += newArray[i][newArray.length-i-1];
            }

        }
        return sum;
     }
     static void main(String[] args) {
         System.out.println("Welcome to Sum Of Diagonal of 2D Array-\n");
         int[][] newArray= ArrayUtility.inputArray();
         int sum  = diagonal(newArray);
         System.out.println("The Sum Of Diagonal Is: "+sum);
     }
}
