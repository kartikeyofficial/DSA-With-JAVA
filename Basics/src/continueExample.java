import java.util.Scanner;

public class continueExample {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n = x.nextInt();
        for (int i=1;i<n;i++){
            if(n%10==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
