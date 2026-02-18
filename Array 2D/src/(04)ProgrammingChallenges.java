class ProgrammingChallenges {
    public static void search(int[][] newArray){
        for (int i=0;i< newArray.length;i++){
            for (int j=0;j<newArray[0].length;j++){
                if(newArray[i][j]==7){
                    System.out.println("Element is Present at index ("+i+","+j+")");
                }
            }
        }
    }
    public static int sum(int[][] newArray){
        int sum=0;
        for (int i=1;i<newArray.length-1;i++){
            for (int j=0;j<newArray[0].length;j++){
                sum += newArray[i][j];
            }
        }
        return sum;
    }
    static void main(String[] args) {
        int[][] newArray = {{1,4,9},{11,4,3},{2,2,3} };
        for (int i=0;i<newArray.length;i++){
            for (int j=0;j<newArray[0].length;j++){
                System.out.print(newArray[i][j]+" ");
            }
            System.out.println();
        }
        search(newArray);
        int sum = sum(newArray);
        System.out.println("Sum of Second Row is: "+sum);
    }
}
