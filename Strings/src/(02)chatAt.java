import java.util.Scanner;

class chatAt {
    public static void printLetters(String name){
        for (int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    static void main(String[] args) {
        System.out.println("welcome to String chatAt() Function: ");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Name: ");
        String name = x.nextLine();
        printLetters(name);
    }
}
