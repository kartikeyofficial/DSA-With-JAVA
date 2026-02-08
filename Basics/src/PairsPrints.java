import java.util.Scanner;

public class PairsPrints {
    public static void pairs(int[] newArray){
        int tp=0;
        for (int i=0;i<newArray.length;i++){
            int curr = newArray[i];
            for (int j=i+1;j<newArray.length;j++){
                System.out.print("("+curr+","+newArray[j]+") ");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total Pairs Are: "+tp);

    }
    static void main(String[] args) {
        System.out.println("Welcome to Pairs of An Array\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array:");
        int size = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Elements "+(i+1)+" :");
            newArray[i]= x.nextInt();
        }
        System.out.println("Pairs Of An Array Elements is:");
        pairs(newArray);
    }
}
