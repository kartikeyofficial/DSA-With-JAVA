import java.util.Scanner;

 class  SumOfNaturalNumbers {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = x.nextInt();
        System.out.println("Sum of N Natural Numbers is: "+SumNatural(num));
    }
    public static int SumNatural(int num){
        if (num==0){
            return 0;
        }
        return num+SumNatural(num-1);
    }
}
