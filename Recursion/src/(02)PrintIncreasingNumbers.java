class PrintIncreasingNumbers {
    public static void printInc(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }

    static void main(String[] args) {
        printInc(10);
    }
}
