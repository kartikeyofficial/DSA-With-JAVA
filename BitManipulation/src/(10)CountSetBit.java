import java.util.Scanner;

class CountSetBit {
    public static int CountBits(int n){
        int count=0;
        while (n>0){
            if ((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = x.nextInt();
        int CountBits = CountBits(n);
        System.out.println("Total Count of 1's in "+n+" is: "+CountBits);

    }
}
