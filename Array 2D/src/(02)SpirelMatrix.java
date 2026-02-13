class SpirelMatrix {
    public static void PrintSpirel(int newArray[][]){
        int startRow = 0;
        int startCols = 0;
        int endRow = newArray.length-1;
        int endCols = newArray[0].length-1;
        while (startRow<=endRow && startCols<=endCols){
            // Top
            for (int j=startCols;j<=endCols;j++){
                System.out.print(newArray[startRow][j]+" ");
            }
            // Right
            for (int i=startRow+1;i<=endRow;i++){
                System.out.print(newArray[i][endCols]+" ");
            }
            // Bottom
            for (int j=endCols-1;j>=startCols;j--){
                if (startRow==endRow){
                      break;
                }
                System.out.print(newArray[endRow][j]+" ");
            }
            // Left
            for (int i=endRow-1;i>=startRow+1;i--){
                if (startCols==endCols){
                    break;
                }
                System.out.print(newArray[i][startCols]+" ");
            }
            startRow++;
            startCols++;
            endRow--;
            endCols--;
        }

    }
    static void main(String[] args) {
        System.out.println("Welcome to Spirel Print Matrix-\n");
        int[][] newArray = ArrayUtility.inputArray();
        PrintSpirel(newArray);
    }
}
