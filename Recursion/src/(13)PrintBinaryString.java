class PrintBinaryString {
    public static void printBinString(int n, int lastPlace, String str){
        if (n == 0){
            System.out.println(str);
            return;
        }
        if (lastPlace == 0){
           printBinString(n-1,0,str+"0");
           printBinString(n-1,1,str+"1");

        }else {
            printBinString(n-1,0,str+"0");
        }


    }

    static void main(String[] args) {
        printBinString(3,0,"");
    }
}
