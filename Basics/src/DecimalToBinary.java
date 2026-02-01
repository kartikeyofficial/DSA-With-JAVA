import java.util.Scanner;

public class DecimalToBinary {
    public static void DeciToBin(int n){
        int binNum =0;
        int pow =0;
        int deci = n;
        while (n>0){

            int rem = n%2;
            binNum = binNum +(rem *(int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("The Binary Number of"+deci+" is: "+binNum);
    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number In Decimal: ");
        int n = x.nextInt();
        DeciToBin(n);

    }
}
