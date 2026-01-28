import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        System.out.println("Enter The Day Number:");
        Scanner x = new Scanner(System.in);
        int days = x.nextInt();
        switch (days){
            case 1: {
                System.out.println("Sunday");
                break;
            }
            case 2: {
                System.out.println("Monday");
                break;
            }
            case 3: {
                System.out.println("Tuesday");
                break;
            }
            case 4: {
                System.out.println("Wednesday");
                break;
            }
            case 5: {
                System.out.println("Thursday");
                break;
            }
            case 6: {
                System.out.println("Friday");
                break;
            }
            case 7: {
                System.out.println("Saturday");
                break;
            }
            default:{
                System.out.println("Invalid Input!");
            }


        }
    }
}
