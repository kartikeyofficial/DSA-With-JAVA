import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int a = x.nextInt();
        System.out.println("Enter The Second Number:");
        int b = x.nextInt();
        System.out.println("Choose the Operator(+,-,*,/,%):");
        char operator = x.next().charAt(0);
        switch (operator){
            case '+':{
                System.out.println(a+b);
                break;
            }
            case '-':{
                System.out.println(a-b);
                break;
            }
            case '*':{
                System.out.println(a*b);
                break;
            }
            case '/':{
                System.out.println(a/b);
                break;
            }
            case '%':{
                System.out.println(a%b);
                break;
            }
            default:{
                System.out.println("Invalid Input!");
            }

        }
    }
}
